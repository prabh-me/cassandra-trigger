package org.apache.cassandra.triggers;

import java.util.HashMap;

public class Constants {

	public static final String ELASTIC_URL = "";
	public static final int ELASTIC_PORT = 9300;
	public static final String RABBIT_URL = "";
	public static final String ELASTIC_CLUSTER_NAME = "";
	public static final HashMap<String, String> ES_INDEX_KEY_MAP;
	public static final HashMap<String, String> TABLE_INDEX_MAP;
	public static final HashMap<String, String> INDEX_ROUTING_MAP;

	static {
		ES_INDEX_KEY_MAP = new HashMap<String, String>();
		ES_INDEX_KEY_MAP = new HashMap<String, String>();
		ES_INDEX_KEY_MAP.put("index1", "key1");

		INDEX_ROUTING_MAP = new HashMap<String, String>();
		INDEX_ROUTING_MAP.put("index1", "key1");

		TABLE_INDEX_MAP = new HashMap<String, String>();
		TABLE_INDEX_MAP.put("table1", "index1");

	}




}
