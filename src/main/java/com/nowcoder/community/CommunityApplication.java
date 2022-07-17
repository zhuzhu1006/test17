package com.nowcoder.community;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommunityApplication {

	public static void main(MysqlxDatatypes.Scalar.String[] args) {
		SpringApplication.run(CommunityApplication.class, args);
	}

}
