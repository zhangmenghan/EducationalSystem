package com.uestc.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.swing.JOptionPane;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	private static String MESSAGE = "";
	private static final String EXCEL_XLS = "xls";
	private static final String EXCEL_XLSX = "xlsx";
	
	/**
	 * 打印Excel
	 * @param excelList 传入的三维数组
	 * @param originXlsxPath 开始时使用的模板(需要带路径)
	 * @param finalXlsxPath 想要生成的文件名(需要带路径)
	 * @param rowBeginNumber 从哪一行开始进行数据插入
	 * @throws IOException 
	 * */
	public static String writeExcel(List<List<List<String>>> excelList,String originXlsxPath, String finalXlsxPath,int rowBeginNumber) throws IOException {
		OutputStream out = null;
		copyFile(originXlsxPath, finalXlsxPath, true);
		try {
			// 读取Excel文档
			File finalXlsxFile = new File(finalXlsxPath);
			Workbook workBook = getWorkbok(finalXlsxFile);
			
			for(int excelListFlag = 0;excelListFlag < excelList.size();excelListFlag++){
				// sheet 对应一个工作页
				Sheet sheet = workBook.getSheetAt(excelListFlag);
				// 创建文件输出流，输出电子表格：这个必须有，否则你在sheet上做的任何操作都不会有效
				out = new FileOutputStream(finalXlsxPath);
				workBook.write(out);
				/**
				 * 往Excel中写新数据
				 */
				List<List<String>> tempdataList = excelList.get(excelListFlag);
				for (int tempdataListFlag = 0; tempdataListFlag < tempdataList.size(); tempdataListFlag++) {
					// 创建一行：从第二行开始，跳过属性列
					Row row = sheet.createRow(tempdataListFlag + rowBeginNumber);
					// 得到要插入的每一条记录
					List<String> tempList = tempdataList.get(tempdataListFlag);
					
					for (int tempListFlag = 0; tempListFlag < tempList.size(); tempListFlag++) {
						Cell cell = row.createCell(tempListFlag);
						cell.setCellValue(tempList.get(tempListFlag));
					}
				}
			}
			
			// 创建文件输出流，准备输出电子表格：这个必须有，否则你在sheet上做的任何操作都不会有效
			out = new FileOutputStream(finalXlsxPath);
			workBook.write(out);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.flush();
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "success";
	}

	/**
	 * 判断Excel的版本,获取Workbook
	 * @param in
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public static Workbook getWorkbok(File file) throws IOException {
		Workbook wb = null;
		FileInputStream in = new FileInputStream(file);
		if (file.getName().endsWith(EXCEL_XLS)) { // Excel 2003
			wb = new HSSFWorkbook(in);
		} else if (file.getName().endsWith(EXCEL_XLSX)) { // Excel 2007/2010
			wb = new XSSFWorkbook(in);
		}
		in.close();
		return wb;
	}
	
	/**
	 * 复制单个文件
	 * @param srcFileName 待复制的文件名
	 * @param descFileName 目标文件名
	 * @param overlay 如果目标文件存在，是否覆盖
	 * @return 如果复制成功返回true，否则返回false
	 */
	public static boolean copyFile(String srcFileName, String destFileName, boolean overlay) throws IOException {
		File srcFile = new File(srcFileName);

		// 判断源文件是否存在
		if (!srcFile.exists()) {
			MESSAGE = "源文件：" + srcFileName + "不存在！";
			JOptionPane.showMessageDialog(null, MESSAGE);
			return false;
		} else if (!srcFile.isFile()) {
			MESSAGE = "复制文件失败，源文件：" + srcFileName + "不是一个文件！";
			JOptionPane.showMessageDialog(null, MESSAGE);
			return false;
		}

		// 判断目标文件是否存在
		File destFile = new File(destFileName);
		if (destFile.exists()) {
			// 如果目标文件存在并允许覆盖
			if (overlay) {
				// 删除已经存在的目标文件，无论目标文件是目录还是单个文件
				new File(destFileName).delete();
			}
		} else {
			// 如果目标文件所在目录不存在，则创建目录
			if (!destFile.getParentFile().exists()) {
				// 目标文件所在目录不存在
				if (!destFile.getParentFile().mkdirs()) {
					// 复制文件失败：创建目标文件所在目录失败
					return false;
				}
			}
		}

		// 复制文件
		int byteread = 0; // 读取的字节数
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream(srcFile);
			out = new FileOutputStream(destFile);
			byte[] buffer = new byte[1024];

			while ((byteread = in.read(buffer)) != -1) {
				out.write(buffer, 0, byteread);
			}
			return true;
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		} finally {
			try {
				if (out != null)
					out.close();
				if (in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}