package com.sandeepsatone.texttranslator;

import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;

public class MicroSoftTextTranslator {
	public static void main(String[] args) throws Exception {
		// Replace client_id and client_secret with your own.
		Translate.setClientId("<YOUR_CLIENT_ID>");
		Translate.setClientSecret("YOUR_CLIENT_SECRET");

		// Translate an English string to Hindi
		String englishString = " This Application is developed by SANDEEP ";
		String hindiTranslation = Translate.execute(englishString, Language.HINDI);
		System.out.println("Original English : " + englishString);
		System.out.println("Translated Hindi : " + hindiTranslation);

	}

}
