package com.cunjunwang.leetcodejava.solutions.solution168_ExcelSheetColumnTitle;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by CunjunWang on 2019-07-18.
 */
public class ExcelSheetColumnTitleTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(ExcelSheetColumnTitleTest.class);

    @Autowired
    private ExcelSheetColumnTitle excelSheetColumnTitle;

    @Test
    public void convertToTitle() {
        String s = excelSheetColumnTitle.convertToTitle(17577);
        logger.info("result = {}", s);
    }
}