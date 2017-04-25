package com.uestc.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {

	private static final String EXCEL_XLS = "xls";
	private static final String EXCEL_XLSX = "xlsx";
	private static int rowFlag = 0;

	/**
	 * 判断Excel的版本,获取Workbook
	 * 
	 * @param in
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public static Workbook getWorkbok(InputStream in, File file) throws IOException {
		Workbook wb = null;
		if (file.getName().endsWith(EXCEL_XLS)) { // Excel 2003
			wb = new HSSFWorkbook(in);
		} else if (file.getName().endsWith(EXCEL_XLSX)) { // Excel 2007/2010
			wb = new XSSFWorkbook(in);
		}
		return wb;
	}

	/**
	 * 判断文件是否是excel
	 * 
	 * @throws Exception
	 */
	public static void checkExcelVaild(File file) throws Exception {
		if (!file.exists()) {
			throw new Exception("文件不存在");
		}
		if (!(file.isFile() && (file.getName().endsWith(EXCEL_XLS) || file.getName().endsWith(EXCEL_XLSX)))) {
			throw new Exception("文件不是Excel");
		}
	}

	/**
	 * 获取一个Excel表的所有数据
	 * @param filePath 需要读的文件名(需要带路径)
	 * @param rowCountFlag 从哪一行开始读入
	 */
	public static List<List<List<String>>> getExcelList(String filePath,int rowCountFlag) throws Exception {
		List<List<List<String>>> excelList = new ArrayList<List<List<String>>>();
		File excelFile = new File(filePath); // 创建文件对象
		FileInputStream is = new FileInputStream(excelFile); // 文件流
		checkExcelVaild(excelFile);
		Workbook workbook = getWorkbok(is, excelFile);

		int sheetCount = workbook.getNumberOfSheets(); // Sheet的数量
		
		for (int sheetFlag = 0; sheetFlag < sheetCount; sheetFlag++) {
			List<List<String>> sheetList = getSheetList(workbook,sheetFlag,rowCountFlag);
			excelList.add(sheetList);
		}
		is.close();
		return excelList;
	}
	
	/**
	 * 拿到一个sheet的String型的List<List<String>>表
	 */
	public static List<List<String>> getSheetList(Workbook workbook,int sheetFlag,int rowCountFlag) throws Exception {
		List<List<String>> sheetList = new ArrayList<List<String>>();
		try {
			
				Sheet sheet = workbook.getSheetAt(sheetFlag); // 遍历第一个Sheet
				// 为跳过第一行目录设置count
				int rowCount = 0;
				for (Row row : sheet) {
					// 跳过第一行的目录
					if (rowCount < rowCountFlag) {
						rowCount++;
						continue;
					}

					// 如果当前行没有数据，跳出循环
					try {
						if (row.getCell(0).toString().equals("")) {
							rowFlag++;
							if (rowFlag == 2) {
								break;
							}
						} else {
							rowFlag = 0;
						}
					} catch (NullPointerException e) {
						// e.printStackTrace();
					}
					List<String> rowList = getcellList(row);
					sheetList.add(rowList);
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		return sheetList;
	}
	

	/**
	 * 拿到一个row的String型的List表
	 */
	@SuppressWarnings("deprecation")
	public static List<String> getcellList(Row row) throws Exception {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		List<String> rowList = new ArrayList<>();
		for (Cell cell : row) {

			if (cell.toString() == null) {
				continue;
			}

			int cellType = cell.getCellType();
			String cellValue = "";
			switch (cellType) {
			case Cell.CELL_TYPE_STRING: // 文本
				cellValue = cell.getRichStringCellValue().getString();
				break;
			case Cell.CELL_TYPE_NUMERIC: // 数字、日期
				if (DateUtil.isCellDateFormatted(cell)) {
					cellValue = fmt.format(cell.getDateCellValue());
				} else {
					cell.setCellType(Cell.CELL_TYPE_STRING);
					cellValue = String.valueOf(cell.getRichStringCellValue().getString());
				}
				break;
			case Cell.CELL_TYPE_BOOLEAN: // 布尔型
				cellValue = String.valueOf(cell.getBooleanCellValue());
				break;
			case Cell.CELL_TYPE_BLANK: // 空白
				cellValue = cell.getStringCellValue() + "#";
				break;
			case Cell.CELL_TYPE_ERROR: // 错误
				cellValue = "错误#";
				break;
			case Cell.CELL_TYPE_FORMULA: // 公式
				// 得到对应单元格的公式
				// cellValue = cell.getCellFormula() + "#";
				// 得到对应单元格的字符串
				cell.setCellType(Cell.CELL_TYPE_STRING);
				cellValue = String.valueOf(cell.getRichStringCellValue().getString());
				break;
			default:
				cellValue = "#";
			}
			rowList.add(cellValue);
		}
		return rowList;
	}
}