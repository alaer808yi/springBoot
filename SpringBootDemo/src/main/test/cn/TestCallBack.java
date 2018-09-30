package cn;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestCallBack {
	static int lock;
	
	public static void main(String args[]) throws IOException{
		char a = '1';
		byte[] c = new byte[2];
		c[0] = (byte)((a & 0xFF00) >> 8);
		c[1] = (byte)(a & 0xFF);
		System.out.println(c[1]);
		System.out.println(c[0]);
		System.out.println((int)a);

		System.out.println("-----");
			
	
		Map<String, Integer> uuMap = new HashMap<String, Integer>();
		uuMap.put("aa", 1);
		int mm = (char)-1;                 
		System.err.println(mm);
		System.err.println((byte)a);
		

		
		 

		
		
	}
	public static SqlSession getSqlSession() throws Exception{
        String resource = "conf.xml";
         //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = Resources.getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
      //创建能执行映射文件中sql的sqlSession
        SqlSession sqlSession = sessionFactory.openSession();
        return sqlSession;
    }
	
	public static void call(Compute compute){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
		compute.oncompute();
		
	}

}

interface Compute{
	public void oncompute();
}

 