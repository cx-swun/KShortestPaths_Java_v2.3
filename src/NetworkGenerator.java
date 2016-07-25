import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Random;


public class NetworkGenerator {
	public static void main(String [] args){
//		System.out.println("test...");
		/*DecimalFormat df = new DecimalFormat("#0.00");
		Integer ios = 10000;//输入输出的总个数，其中奇数为输入，偶数为输出。
		Integer types = 30;//数据类型的个数
		Integer io_per_type = ios/types/2;
//		System.out.println(av);
		
		
		Random random = new Random();
		
		String fileName = "data/graph";
		File graphFile = new File(fileName);
		
		try {
			OutputStream os = new FileOutputStream(graphFile);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			
			osw.write(ios + "\n\n");
			
			
//			for(int i = 0; i < dim; i++){
//				for(int j = 0; j < dim; j++){
//					if(i == j) continue;
//					Boolean connected = random.nextBoolean();
//					if(connected){
////						Double cost = random.nextDouble();
////						cost.
//						Integer cost = 1;
//						osw.write(i + " " + j + " " + cost + "\n");
//					}
//				}
//			}
			
			for(int i = 0; i < ios; i++){
				Integer cost = random.nextInt(100) + random.nextInt(10) + 10;
				if(i % 2 == 0){//偶数是输入
					//紧邻的奇数为对应于该输入的输出。即，该输入和该输出属于同一个操作，操作有一个费用cost
					osw.write(i + " " + (i+1) + " " + cost + "\n");
					continue;
				}
				else{//所有的奇数为输出
					Integer connectivity = 0;
					
					for(int j = 0; j < ios; j++){
						if(j % 2 == 1) continue;//输出应该接输入，如果后续仍然是输出，则不讨论。
						
						Boolean connected = random.nextBoolean();
						if(connected){
							osw.write(i + " " + j + " " + "0\n");
							connectivity = connectivity + 1;
							System.out.println(connectivity);
						}
						if(connectivity >= io_per_type){
							break;
						}
					}
				}
			}
			
			osw.close();
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		generateGraphByOperation(25, 10000, "data/graph_25_10000");
		generateGraphByOperation(25, 20000, "data/graph_25_20000");
		generateGraphByOperation(25, 30000, "data/graph_25_30000");
		generateGraphByOperation(25, 40000, "data/graph_25_40000");
		generateGraphByOperation(25, 50000, "data/graph_25_50000");
		generateGraphByOperation(25, 60000, "data/graph_25_60000");
		generateGraphByOperation(25, 70000, "data/graph_25_70000");
		generateGraphByOperation(25, 80000, "data/graph_25_80000");
		generateGraphByOperation(25, 90000, "data/graph_25_90000");
		generateGraphByOperation(25, 100000, "data/graph_25_100000");
		
		generateGraphByOperation(50, 10000, "data/graph_50_10000");
		generateGraphByOperation(50, 20000, "data/graph_50_20000");
		generateGraphByOperation(50, 30000, "data/graph_50_30000");
		generateGraphByOperation(50, 40000, "data/graph_50_40000");
		generateGraphByOperation(50, 50000, "data/graph_50_50000");
		generateGraphByOperation(50, 60000, "data/graph_50_60000");
		generateGraphByOperation(50, 70000, "data/graph_50_70000");
		generateGraphByOperation(50, 80000, "data/graph_50_80000");
		generateGraphByOperation(50, 90000, "data/graph_50_90000");
		generateGraphByOperation(50, 100000, "data/graph_50_100000");
		
		generateGraphByOperation(75, 10000, "data/graph_75_10000");
		generateGraphByOperation(75, 20000, "data/graph_75_20000");
		generateGraphByOperation(75, 30000, "data/graph_75_30000");
		generateGraphByOperation(75, 40000, "data/graph_75_40000");
		generateGraphByOperation(75, 50000, "data/graph_75_50000");
		generateGraphByOperation(75, 60000, "data/graph_75_60000");
		generateGraphByOperation(75, 70000, "data/graph_75_70000");
		generateGraphByOperation(75, 80000, "data/graph_75_80000");
		generateGraphByOperation(75, 90000, "data/graph_75_90000");
		generateGraphByOperation(75, 100000, "data/graph_75_100000");
		
		generateGraphByOperation(100, 10000, "data/graph_100_10000");
		generateGraphByOperation(100, 20000, "data/graph_100_20000");
		generateGraphByOperation(100, 30000, "data/graph_100_30000");
		generateGraphByOperation(100, 40000, "data/graph_100_40000");
		generateGraphByOperation(100, 50000, "data/graph_100_50000");
		generateGraphByOperation(100, 60000, "data/graph_100_60000");
		generateGraphByOperation(100, 70000, "data/graph_100_70000");
		generateGraphByOperation(100, 80000, "data/graph_100_80000");
		generateGraphByOperation(100, 90000, "data/graph_100_90000");
		generateGraphByOperation(100, 100000, "data/graph_100_100000");
		
	}
	
	public static void generateGraphByOperation(int types, int ops, String fileName){
		Random random = new Random();
		File graphFile = new File(fileName);
		int total = types + ops;
		int opsPerType = ops/types;
		int costMax = 20;
		
		try {
			long t1 = System.currentTimeMillis();
			
			OutputStream os = new FileOutputStream(graphFile);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			
			osw.write(total + "\n\n");
			
			for(int i = 0; i < types; i++){//i是Datatype，j, k是Operation
				for(int k = types; k < types + opsPerType; k++){
					int cost = random.nextInt(costMax) + 1;
					osw.write(i + " " + k + " " + cost + "\n");
				}
			}
			
			for(int j = types; j < total; j++){
				
				//确定operation的输出数据类型
				int outputDT = random.nextInt(types);
				int cost = random.nextInt(costMax) + 1;
				osw.write(j + " " + outputDT + " " + cost + "\n");
			}
			
			osw.close();
			os.close();
			
			long t2 = System.currentTimeMillis();
			System.out.println(fileName);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
