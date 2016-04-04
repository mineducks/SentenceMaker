/**
 * @author Mineducks
 * @version 1.0.0
 */
import java.util.Random;
public class GufengMaker {
	Random random = new Random();
	String[] curv = new String[]{"我","你","他"};
	String[] two_chars_words = new String[]{"朱砂","天下","杀伐","人家","韶华","风华","白衣","嫁衣","倾城","血染","墨染","古琴","无情","散乱","春风","伊人","心疼","素衣"}; 
	String[] four_chars_words = new String[] {"繁华落尽","不诉离殇","情深缘浅","情深不寿","莫失莫忘","如花美眷","似水流年","阴阳相隔","曲终人散","一世长安"};
	int indexofcurv = random.nextInt(3);
	int indexoffour = random.nextInt(10);
	int indexoffour2 = random.nextInt(10);
	int indexoffour3 = random.nextInt(10);
	int indexoffour4 = random.nextInt(10);
	int indexoftwo = random.nextInt(18);
	int indexoftwo2 = random.nextInt(18);
	int indexoftwo3 = random.nextInt(18);
	int indexoftwo4 = random.nextInt(18);
	String[] model = new String[]{curv[indexofcurv]+"说"+four_chars_words[Math.abs(indexoffour)],two_chars_words[Math.abs(indexoffour)]+"了"+two_chars_words[Math.abs(indexoftwo)],curv[indexofcurv]+"说"+four_chars_words[Math.abs(indexoffour2)]+",最后不过"+four_chars_words[Math.abs(indexoffour3)],two_chars_words[Math.abs(indexoftwo)]+","+two_chars_words[Math.abs(indexoftwo2)],two_chars_words[Math.abs(indexoftwo3)]+"了"+two_chars_words[Math.abs(indexoftwo4)],four_chars_words[Math.abs(indexoffour)]+","+four_chars_words[Math.abs(indexoffour2)]+",终不敌"+four_chars_words[Math.abs(indexoffour3)],two_chars_words[Math.abs(indexoftwo)]+","+two_chars_words[Math.abs(indexoftwo2)]+"许我一场"+four_chars_words[Math.abs(indexoffour)],curv[indexofcurv]+"说"+four_chars_words[Math.abs(indexoffour)]+four_chars_words[Math.abs(indexoffour2)]+",后来"+four_chars_words[Math.abs(indexoffour3)]+four_chars_words[Math.abs(indexoffour4)]};
	int sentenceindex = random.nextInt(8);
	int sentenceindex2 = random.nextInt(8);
	
	public static void main(String[] args){
		GufengMaker gm = new GufengMaker();
		gm.getSentence();
	}
	public void nosame(){
		if(indexoffour == indexoffour2){
			indexoffour = indexoffour - (int)(random.nextInt(10));
		}
		if(indexoffour2 == indexoffour3){
			indexoffour2 = indexoffour2 - (int)(random.nextInt(10));
		}
		if(indexoffour3 == indexoffour4){
			indexoffour4 = indexoffour4 - (int)(random.nextInt(10));
		}
		if(indexoftwo == indexoftwo2){
			indexoftwo = indexoftwo - (int)(random.nextInt(18));
		}
		if(indexoftwo2 == indexoftwo3){
			indexoftwo2 = indexoftwo2 - (int)(random.nextInt(18));
		}
		if(indexoftwo3 == indexoftwo4){
			indexoftwo3 = indexoftwo3 - (int)(random.nextInt(18));
		}
		if(sentenceindex == sentenceindex2){
			sentenceindex = sentenceindex - (int)(random.nextInt(8));
		}
	}
	public void getSentence(){
		nosame();
		if(model[Math.abs(sentenceindex)].contains(model[Math.abs(sentenceindex2)])){
			sentenceindex2 = sentenceindex2 - 2;
		}
		if(model[Math.abs(sentenceindex)].length() <=15 ){
		System.out.println(model[Math.abs(sentenceindex)]+","+model[Math.abs(sentenceindex2)]);
		}else{
			System.out.println(model[Math.abs(sentenceindex)]);
		}
		//System.out.println(four_chars_words.length);
	}
	
}
