package com.inetbanking.utilities;

import java.io.IOException;

public class ExcelTest {

	public static void main(String[] args) throws IOException {
		
		
			String path="C:\\Users\\Manoj Kumar\\eclipse-workspace\\inetBankingV1\\Configuration\\TestData.xlsx";
			System.out.println(path);
			int rowCount= XLUtils.rowCount(path,"Sheet1");
			int colCount=XLUtils.colCount(path, "Sheet1", rowCount);
			String[][] loginData=new String[rowCount][colCount];
			for(int i=1;i<=rowCount;i++)
			{
				for(int j=0;j<colCount;j++)
				{
					loginData[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
					System.out.println(loginData[i-1][j]);
				}
				
			}
			
		
	}

}
