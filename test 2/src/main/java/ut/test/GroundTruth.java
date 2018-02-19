package ut.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Session;

import com.google.gson.Gson;

import ut.config.HibernateUtil;
import ut.entity.Timeseries;
import ut.entity.source.MitreIGTB;
import ut.utils.Pair;

public class GroundTruth {

	public static void InitialGT(String[] selectedKeys) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		List<Timeseries> list = session.createQuery("from Timeseries where stream_major=3 and stream_minor=20011")
				.list(); // here

		int empty = 0;
		for (Timeseries entity : list) {
			String json = entity.getBlob().replace("\\\"", "\"");
			if (StringUtils.isNotBlank(json) && (json.startsWith("\"") || json.endsWith("\""))) {
				json = json.substring(1, json.length() - 1);
			}
			MitreIGTB mitreIGTB = new Gson().fromJson(json, MitreIGTB.class);
			if (mitreIGTB.getData().getResponses().size() == 0)
				empty++;

			if (mitreIGTB.getData().getResponses().size() > 0) {
				Map<String, String> scores = mitreIGTB.getData().getResponses()
						.get(mitreIGTB.getData().getResponses().size() - 1);
				Map<String, String> outputs = new HashMap<String, String>();
				outputs.put("userid", entity.getSnapshot_id().toString());
				for (String key : selectedKeys)
					outputs.put(key, scores.get(key));
				System.out.println(outputs);
			}
		}

		session.getTransaction().commit();
		session.close();
	}

	public static void main(String[] args) {
		String[] selectedKeys = { "itp_itp1", "itp_itp2", "itp_itp3" };
		GroundTruth.InitialGT(selectedKeys);
	}
}
