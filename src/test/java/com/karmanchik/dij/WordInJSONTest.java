package com.karmanchik.dij;

import lombok.extern.log4j.Log4j;
import lombok.var;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Log4j
class WordInJSONTest {

    @Test
    public void testParsingTimetable() {
        WordInJSON wordInJSON = new WordInJSON();
        File file = new File("src\\main\\resources\\files\\Расписание 3-4 курса 1 семестр 2020-2021 уч год ДЕНЬ-НОЧЬ.docx");
        String text = wordInJSON.wordFileAsText(file);
        List<String> stringList = Arrays.asList(text.split("\\n"));
        var json = wordInJSON.textToJSON(stringList);
        log.info(json.toString());
    }

    @Test
    public void testParsingReplacement() {
        WordInJSON wordInJSON = new WordInJSON();
        File file = new File("src\\main\\resources\\files\\Z_A_M_E_N_A_na_pyatnitsu_18_dekabrya_nedelya_nizhnyaya_doc.docx");
        String text = wordInJSON.wordFileAsText(file);
        List<String> stringList = Arrays.asList(text.split("\\n"));
        stringList.forEach(log::info);
    }
}