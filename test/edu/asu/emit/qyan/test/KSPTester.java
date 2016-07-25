package edu.asu.emit.qyan.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

import edu.asu.emit.qyan.alg.control.YenTopKShortestPathsAlg;
import edu.asu.emit.qyan.alg.model.Graph;
import edu.asu.emit.qyan.alg.model.Path;
import edu.asu.emit.qyan.alg.model.VariableGraph;

public class KSPTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testKSP(18910, 13491, 10, "graph_data");

	}

	public static Graph loadGraph(String fileName) {
		long genGraphStart = System.currentTimeMillis();

		Graph graph = new VariableGraph(fileName);

		long genGraphEnd = System.currentTimeMillis();
		System.out.println("generate graph: " + fileName + ", time: " + (genGraphEnd - genGraphStart));
		return graph;
	}

	public static String testKSP(int start, int end, int paths, Graph graph, String resultFilePath) {
		/* 生成一个图，具体是哪种类型的图，请自己查看相应的源代码，时间隔太久，我也记不清楚 */

		long t1 = System.currentTimeMillis();// 算法开始运行时的时间

		YenTopKShortestPathsAlg yenAlg = new YenTopKShortestPathsAlg(graph);
		List<Path> list = yenAlg.get_shortest_paths(graph.get_vertex(start), graph.get_vertex(end), paths);
		long t2 = System.currentTimeMillis();// 算法结束时的时间

		Long queryTime = t2 - t1;

		for (Path p : list) {
			System.out.println(p);// 将找到的前k条路径，每条都打印出来
		}
		/* 打印一些总结消息 */
		String str = "---------- paths: " + paths + ", time: " + queryTime + " ----------\n";

		System.out.println(str);

		FileOutputStream fs = null;
		Writer w = null;

		try {
			fs = new FileOutputStream(new File(resultFilePath), true);
			w = new OutputStreamWriter(fs);
			// ResultSetFormatter.out(fs, results, query);
			String queryTimeStr = queryTime.toString();
			w.write(queryTimeStr + "\n");

			w.close();
			fs.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return str;

		// System.out.println(t2 - t1);
	}

	public static String testKSP(int start, int end, int paths, String fileName, String resultFilePath) {
		/* 生成一个图，具体是哪种类型的图，请自己查看相应的源代码，时间隔太久，我也记不清楚 */

		long genGraphStart = System.currentTimeMillis();

		Graph graph = new VariableGraph(fileName);

		long genGraphEnd = System.currentTimeMillis();
		System.out.println("generate graph: " + fileName + ", time: " + (genGraphEnd - genGraphStart));

		long t1 = System.currentTimeMillis();// 算法开始运行时的时间

		YenTopKShortestPathsAlg yenAlg = new YenTopKShortestPathsAlg(graph);
		List<Path> list = yenAlg.get_shortest_paths(graph.get_vertex(start), graph.get_vertex(end), paths);
		long t2 = System.currentTimeMillis();// 算法结束时的时间

		Long queryTime = t2 - t1;

		for (Path p : list) {
			System.out.println(p);// 将找到的前k条路径，每条都打印出来
		}
		/* 打印一些总结消息 */
		String str = "---------- graph: " + fileName + ", paths: " + paths + ", time: " + queryTime + " ----------\n";

		System.out.println(str);

		FileOutputStream fs = null;
		Writer w = null;

		try {
			fs = new FileOutputStream(new File(resultFilePath), true);
			w = new OutputStreamWriter(fs);
			// ResultSetFormatter.out(fs, results, query);
			String queryTimeStr = queryTime.toString();
			w.write(queryTimeStr + "\n");

			w.close();
			fs.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return str;

		// System.out.println(t2 - t1);
	}
}
