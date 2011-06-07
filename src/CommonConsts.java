// -*- coding:utf-8 -*-
/*
  インデックス作成、検索時に必要な共通の定数
*/

package kui.wikipedia.title.search;

import java.util.HashSet;
import org.apache.lucene.util.Version;
import org.apache.lucene.analysis.standard.StandardAnalyzer;

interface CommonConsts{

    final static Version VERSION = Version.LUCENE_32;
    final static String TITLE_FIELD = "title";
    final static String ABST_FIELD = "abstruct";

    final public static class AbstSearchAnalyzer
	extends StandardAnalyzer{

	public Analyzer(){
	    super(VERSION);
	}

    }

}
