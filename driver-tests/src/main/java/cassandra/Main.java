package cassandra;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;

public class Main {

    public static void main(String[] args) {
        try (CqlSession session = CqlSession.builder().build()) {
            ResultSet rs = session.execute("select * from killrvideo.videos_by_tag");
            Row row = rs.one();
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println(row.getUuid("video_id"));
            System.out.println(row.getString("title"));
        }
    }
}
