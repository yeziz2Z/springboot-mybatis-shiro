package com.liuk.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class SpringbootMybatisShiroApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testLambda(){
		List<Map<String,Object>> list = new ArrayList<>();
		Map<String,Object> map = new HashMap();
		map.put("id",1);
		map.put("distance",74.7);
		list.add(map);
		map = new HashMap();
		map.put("id",2);
		map.put("distance",54.7);
		list.add(map);
		map = new HashMap();
		map.put("id",3);
		map.put("distance",33.3);
		list.add(map);

		String id = list.stream()
				.sorted(Comparator.comparingDouble(o -> (Double) o.get("distance")))
				.findFirst().map(ma ->  ma.get("id").toString()).get();

		System.out.println(list);

		Map<String, Object> map1 = list.stream().filter(ma -> ma.get("id").toString().equals(id)).findFirst().get();

		System.out.println(id);

		System.out.println(map1);

	}
}
