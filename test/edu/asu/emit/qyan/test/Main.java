package edu.asu.emit.qyan.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import edu.asu.emit.qyan.alg.control.YenTopKShortestPathsAlg;
import edu.asu.emit.qyan.alg.model.Graph;
import edu.asu.emit.qyan.alg.model.Path;
import edu.asu.emit.qyan.alg.model.VariableGraph;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testKSP(0, 5, 3, "data/qosgraph.txt");
		
//		int i=0;
//		while(yenAlg.has_next())
//		{
//			System.out.println("Path "+i+++" : "+yenAlg.next());
//		}
		
		String resultFileName = ("data/results2");
		File file = new File(resultFileName);
		try {
			OutputStream os = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			String str = "";
			
			for(int i = 0; i < 5; i++){
				str = testKSP(0, 10, 5, "data/graph_25_10000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_25_20000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_25_30000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_25_40000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_25_50000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_25_60000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_25_70000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_25_80000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_25_90000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_25_100000");
				osw.write(str);
				
				str = testKSP(0, 10, 10, "data/graph_25_10000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_25_20000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_25_30000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_25_40000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_25_50000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_25_60000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_25_70000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_25_80000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_25_90000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_25_100000");
				osw.write(str);
			}
			
			for(int i = 0; i < 5; i++){
				str = testKSP(0, 10, 5, "data/graph_50_10000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_50_20000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_50_30000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_50_40000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_50_50000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_50_60000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_50_70000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_50_80000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_50_90000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_50_100000");
				osw.write(str);
				
				str = testKSP(0, 10, 10, "data/graph_50_10000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_50_20000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_50_30000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_50_40000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_50_50000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_50_60000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_50_70000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_50_80000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_50_90000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_50_100000");
				osw.write(str);
			}
			
			for(int i = 0; i < 5; i++){
				str = testKSP(0, 10, 5, "data/graph_75_10000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_75_20000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_75_30000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_75_40000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_75_50000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_75_60000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_75_70000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_75_80000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_75_90000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_75_100000");
				osw.write(str);
				
				str = testKSP(0, 10, 10, "data/graph_75_10000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_75_20000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_75_30000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_75_40000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_75_50000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_75_60000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_75_70000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_75_80000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_75_90000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_75_100000");
				osw.write(str);
			}
			
			for(int i = 0; i < 5; i++){
				str = testKSP(0, 10, 5, "data/graph_100_10000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_100_20000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_100_30000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_100_40000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_100_50000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_100_60000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_100_70000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_100_80000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_100_90000");
				osw.write(str);
				str = testKSP(0, 10, 5, "data/graph_100_100000");
				osw.write(str);
				
				str = testKSP(0, 10, 10, "data/graph_100_10000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_100_20000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_100_30000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_100_40000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_100_50000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_100_60000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_100_70000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_100_80000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_100_90000");
				osw.write(str);
				str = testKSP(0, 10, 10, "data/graph_100_100000");
				osw.write(str);
			}
			
			
			osw.close();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String testKSP(int start, int end, int paths, String fileName){
		/*生成一个图，具体是哪种类型的图，请自己查看相应的源代码，时间隔太久，我也记不清楚*/
		Graph graph = new VariableGraph(fileName);
		long t1 = System.currentTimeMillis();//算法开始运行时的时间
		
		YenTopKShortestPathsAlg yenAlg = new YenTopKShortestPathsAlg(graph);
		List<Path> list = yenAlg.get_shortest_paths(graph.get_vertex(start), graph.get_vertex(end), paths);
		long t2 = System.currentTimeMillis();//算法结束时的时间
		for(Path p : list){
			System.out.println(p);//将找到的前k条路径，每条都打印出来
		}
		/*打印一些总结消息*/
		String str = "---------- graph: " + fileName + ", paths: " + paths + ", time: " + (t2 - t1) + " ----------\n";
		
		System.out.println(str);
		return str;
		
//		System.out.println(t2 - t1);
	}

}
