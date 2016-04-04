/**
 * @author Mineducks
 **/
import java.util.Random;
import java.util.Scanner;
public class Makers {
	Scanner input =new Scanner(System.in);
	Random random = new Random();
	public static void main(String[] args) {
	Makers mk = new Makers();
	mk.GetSentence();
	}
	public void GetSentence(){
		System.out.println("请输入你要生成的句子数量:");
		int Sentence = input.nextInt();
		for(int i = 1; i<=Sentence;i++){
			String[] curv = new String[]{"我","你","他"};
			String[] two_chars_words = new String[]{"朱砂","天下","杀伐","人家","韶华","风华","白衣","嫁衣","倾城","血染","墨染","古琴","无情","散乱","春风","伊人","心疼","素衣","烟火","一生","三生","离殇","情殇","爱殇","仓皇","匆忙","陌上","回眸","公子","白骨","黄土","黄泉","碧落","笑靥","乱世","纸伞","千年"}; 
			String[] four_chars_words = new String[] {"繁华落尽","不诉离殇","情深缘浅","情深不寿","莫失莫忘","如花美眷","似水流年","阴阳相隔","曲终人散","一世长安","眉目如画"};
			int indexofcurv = random.nextInt(3);
			int indexoffour = random.nextInt(11);
			int indexoffour2 = random.nextInt(11);
			int indexoffour3 = random.nextInt(11);
			int indexoffour4 = random.nextInt(11);
			int indexoftwo = random.nextInt(37);
			int indexoftwo2 = random.nextInt(37);
			int indexoftwo3 = random.nextInt(37);
			int indexoftwo4 = random.nextInt(37);
			int sentenceindex = random.nextInt(8);
			int sentenceindex2 = random.nextInt(8);
			if(indexoffour == indexoffour2){
				indexoffour = indexoffour - (int)(random.nextInt(11));
			}
			if(indexoffour2 == indexoffour3){
				indexoffour2 = indexoffour2 - (int)(random.nextInt(11));
			}
			if(indexoffour3 == indexoffour4){
				indexoffour4 = indexoffour4 - (int)(random.nextInt(11));
			}
			if(indexoftwo == indexoftwo2){
				indexoftwo = indexoftwo - (int)(random.nextInt(37));
			}
			if(indexoftwo2 == indexoftwo3){
				indexoftwo2 = indexoftwo2 - (int)(random.nextInt(37));
			}
			if(indexoftwo3 == indexoftwo4){
				indexoftwo3 = indexoftwo3 - (int)(random.nextInt(37));
			}
			if(sentenceindex == sentenceindex2){
				sentenceindex = sentenceindex - (int)(random.nextInt(8));
			}
			String[] model = new String[]{curv[indexofcurv]+"说"+four_chars_words[Math.abs(indexoffour)],two_chars_words[Math.abs(indexoffour)]+"了"+two_chars_words[Math.abs(indexoftwo)],curv[indexofcurv]+"说"+four_chars_words[Math.abs(indexoffour2)]+",最后不过"+four_chars_words[Math.abs(indexoffour3)],two_chars_words[Math.abs(indexoftwo)]+","+two_chars_words[Math.abs(indexoftwo2)],two_chars_words[Math.abs(indexoftwo3)]+"了"+two_chars_words[Math.abs(indexoftwo4)],four_chars_words[Math.abs(indexoffour)]+","+four_chars_words[Math.abs(indexoffour2)]+",终不敌"+four_chars_words[Math.abs(indexoffour3)],two_chars_words[Math.abs(indexoftwo)]+","+two_chars_words[Math.abs(indexoftwo2)]+"许我一场"+four_chars_words[Math.abs(indexoffour)],curv[indexofcurv]+"说"+four_chars_words[Math.abs(indexoffour)]+four_chars_words[Math.abs(indexoffour2)]+",后来"+four_chars_words[Math.abs(indexoffour3)]+four_chars_words[Math.abs(indexoffour4)]};
			System.out.println(model[Math.abs(sentenceindex)]+","+model[Math.abs(sentenceindex2)]);
			
		}
	}
}
