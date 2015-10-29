package com.ravi.test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ravi.test.vo.TestVO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		// System.out.println( "Hello World!" );
		// testList();

		TestVO testVO = new TestVO();
		testVO.setName("KIA Motors");
		//testVO.setAge("20");
		testVO.setAddress(testList());

		// org.codehaus.jettison.json.

		String jsonStr = null;
		Map<String, TestVO> map = new HashMap<String, TestVO>();
		map.put("test1", testVO);
		map.put("test2", testVO);

		JSONObject jsonObject = new JSONObject(map);

		// System.out.println(jsonObject);

		System.out.println("TestVO==>" + objectToJson(testVO));

		System.out.println("AppDevice==>" + createAppDeviceJSONObject());

		// System.out.println(new JSONObject().put("test1", testVO).put("test2",
		// testVO));

		System.out.println("Test JSO==>" + createTestJSON());

	}

	public static String objectToJson(Object aObj)
			throws JsonGenerationException, JsonMappingException, IOException {
		String json = "{}";
		Writer writer = null;
		if (aObj == null) {
			return json;
		}
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
			writer = new StringWriter();
			mapper.writeValue(writer, aObj);
			json = writer.toString();

		} finally {
			if (writer != null) {
				writer.close();
			}
		}
		return json;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static List testList() {
		List list = new ArrayList();
		list.add("KIA Address 1");
		list.add("KIA Address 2");
		// System.out.println(list);
		return list;
	}

	private static JSONObject createAppDeviceJSONObject() throws JSONException {

		return new JSONObject().put("osType", "0").put("osVersion", "4.3")
				.put("appType", "E").put("appVersion", "0.0.0.20")
				.put("active", "Y");

	}

	private static JSONObject createTestJSON() throws JSONException {

		return new JSONObject().put("success", true).put("osVersion", 4.3)
				.put("appType", 'E').put("appVersion", "0.0.0.20")
				.put("active", "Y");

	}

}
