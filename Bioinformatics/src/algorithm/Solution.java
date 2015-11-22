package algorithm;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	//model data
	public static ArrayList<Average> remAverage = new ArrayList<Average>();
	public static ArrayList<Average> resistAverage = new ArrayList<Average>();
	
	public static ArrayList<Patient> patients = new ArrayList<Patient>();
		
    public static void main(String[] args) {
    	populateAvg();
    	System.out.println(remAverage.size());
    	try{
			PropertyImport dummy1 = new PropertyImport("dummy");
			patients.add(new Patient(dummy1.finalprops));
			
			File file = new File("trainingData.txt");
			Scanner scanner = new Scanner(file);
			String line = "";
			
			while(scanner.hasNext()){
				line = scanner.nextLine();
				PropertyImport a = new PropertyImport(line);
				Patient p = new Patient(a.finalprops);
				patients.add(p);
			}
			scanner.close();
			
			Analyze();
    	}catch(Exception e){
    		System.out.println(e);
    	}
    	
    }
    
    public static void Analyze(){
    	int remissionChance = 0;
    	int rejectionChance = 0;
	    for(int i=1; i<patients.size(); i++){
	    	for(int j=1; i<remAverage.size(); j++){
	    		if(!(j == 0 ||j == 1 ||j == 4 ||j == 5 ||j == 6 ||j == 7 ||j == 8 ||j == 9 ||j == 10 ||j == 11)){
		    		Double remChance = Double.valueOf(patients.get(i).properties[j].propertyValue)-remAverage.get(j).average;
		    		Double resistChance = Double.valueOf(patients.get(i).properties[j].propertyValue)-resistAverage.get(j).average;
		    		if(remChance > resistChance){
		    			remissionChance++;
		    		}else{
		    			rejectionChance++;
		    		}
	    		}
	    	}
	    	if(remissionChance>rejectionChance){
	    		System.out.println(patients.get(i).properties[0]+" COMPLETE_REMISSION"+" 0"+" 0");
	    	}else{
	    		System.out.println(patients.get(i).properties[0]+" RESISTANT"+" 0"+" 0");
	    	}
	    	remissionChance = 0;
	    	rejectionChance = 0;
	    }
    }
       
    public static void populateAvg(){
    	//populates avgRemission
    	remAverage.add(new Average(53.633826086956546,2));
    	remAverage.add(new Average(4.460869565217391,3));
    	remAverage.add(new Average(25.874782608695643,12));
    	remAverage.add(new Average(15314.43043478261,13));
    	remAverage.add(new Average(52.69298245614035,14));
    	remAverage.add(new Average(4.672566371681416,15));
    	remAverage.add(new Average(1.3274336283185841,16));
    	remAverage.add(new Average(30.812173913043477,17));
    	remAverage.add(new Average(13.396929824561404,18));
    	remAverage.add(new Average(0.7324561403508771,19));
    	remAverage.add(new Average(9.804385964912285,20));
    	remAverage.add(new Average(86.3157894736842,21));
    	remAverage.add(new Average(1472.765137614679,22));
    	remAverage.add(new Average(3.5147826086956515,23));
    	remAverage.add(new Average(0.6078260869565216,24));
    	remAverage.add(new Average(0.9486956521739127,25));
    	remAverage.add(new Average(443.6111111111111,26));
    	remAverage.add(new Average(77.40990990990991,27));
    	remAverage.add(new Average(76.33153153153152,28));
    	remAverage.add(new Average(46.06576576576576,29));
    	remAverage.add(new Average(13.213513513513512,30));
    	remAverage.add(new Average(4.171171171171171,31));
    	remAverage.add(new Average(0.8119266055045871,32));
    	remAverage.add(new Average(75.97297297297297,33));
    	remAverage.add(new Average(9.717117117117116,34));
    	remAverage.add(new Average(-0.015484642443478268,35));
    	remAverage.add(new Average(0.09972615552173904,36));
    	remAverage.add(new Average(-0.125125911,37));
    	remAverage.add(new Average(0.0012286760782608713,38));
    	remAverage.add(new Average(0.0701560413826087,39));
    	remAverage.add(new Average(-0.04598999170434783,40));
    	remAverage.add(new Average(-0.028916815391304317,41));
    	remAverage.add(new Average(-0.05885712662608696,42));
    	remAverage.add(new Average(0.07851404065217393,43));
    	remAverage.add(new Average(0.01477617613043473,44));
    	remAverage.add(new Average(-0.06337348911304347,45));
    	remAverage.add(new Average(9.254858956522131E-4,46));
    	remAverage.add(new Average(0.041163104078260876,47));
    	remAverage.add(new Average(0.12224583866956527,48));
    	remAverage.add(new Average(0.18851167372173908,49));
    	remAverage.add(new Average(0.11006732115652172,50));
    	remAverage.add(new Average(0.1137115422260869,51));
    	remAverage.add(new Average(-0.03276846877391301,52));
    	remAverage.add(new Average(-0.08408255970434787,53));
    	remAverage.add(new Average(-0.048016524243478256,54));
    	remAverage.add(new Average(0.034882478930434765,55));
    	remAverage.add(new Average(0.16039831270434773,56));
    	remAverage.add(new Average(-0.022322520017391295,57));
    	remAverage.add(new Average(-0.08163565492173915,58));
    	remAverage.add(new Average(0.15273390676521736,59));
    	remAverage.add(new Average(-0.03228576000869565,60));
    	remAverage.add(new Average(0.058821997930434765,61));
    	remAverage.add(new Average(0.16487731467826086,62));
    	remAverage.add(new Average(0.12488198293043477,63));
    	remAverage.add(new Average(0.2118970570608695,64));
    	remAverage.add(new Average(0.08847549728695647,65));
    	remAverage.add(new Average(0.1292190298347827,66));
    	remAverage.add(new Average(0.09189925375652173,67));
    	remAverage.add(new Average(-0.06542337603478261,68));
    	remAverage.add(new Average(0.03206368165217399,69));
    	remAverage.add(new Average(0.03199635526086957,70));
    	remAverage.add(new Average(0.03152708261739129,71));
    	remAverage.add(new Average(0.1693589153652174,72));
    	remAverage.add(new Average(0.0784223000608696,73));
    	remAverage.add(new Average(0.03759623548695645,74));
    	remAverage.add(new Average(0.12770945114782606,75));
    	remAverage.add(new Average(0.03632216004347826,76));
    	remAverage.add(new Average(0.054599450226086935,77));
    	remAverage.add(new Average(-0.00437382169565219,78));
    	remAverage.add(new Average(0.06618140606086961,79));
    	remAverage.add(new Average(-0.13509830126086964,80));
    	remAverage.add(new Average(0.09351526299130425,81));
    	remAverage.add(new Average(0.0868179688,82));
    	remAverage.add(new Average(0.043028577095652096,83));
    	remAverage.add(new Average(0.05357216281739134,84));
    	remAverage.add(new Average(0.1292231358521739,85));
    	remAverage.add(new Average(-0.17248511000000005,86));
    	remAverage.add(new Average(0.06628321101739133,87));
    	remAverage.add(new Average(-0.2681635148521738,88));
    	remAverage.add(new Average(0.036235878165217436,89));
    	remAverage.add(new Average(0.11382538593913037,90));
    	remAverage.add(new Average(0.0788597097043478,91));
    	remAverage.add(new Average(0.0801927489043478,92));
    	remAverage.add(new Average(-0.08468506839999994,93));
    	remAverage.add(new Average(0.06881329051304351,94));
    	remAverage.add(new Average(0.03410218320869566,95));
    	remAverage.add(new Average(0.019277803504347824,96));
    	remAverage.add(new Average(-0.09532279037391304,97));
    	remAverage.add(new Average(0.021957021286956518,98));
    	remAverage.add(new Average(-0.032012172826087044,99));
    	remAverage.add(new Average(0.10419500527826084,100));
    	remAverage.add(new Average(-0.03946292395652174,101));
    	remAverage.add(new Average(0.029897894260869574,102));
    	remAverage.add(new Average(0.058790087034782605,103));
    	remAverage.add(new Average(-0.17045100282608688,104));
    	remAverage.add(new Average(0.02616401092173914,105));
    	remAverage.add(new Average(-0.10511200240869559,106));
    	remAverage.add(new Average(0.027710265104347837,107));
    	remAverage.add(new Average(-0.014471473895652169,108));
    	remAverage.add(new Average(0.004972726408695677,109));
    	remAverage.add(new Average(0.06382011983478258,110));
    	remAverage.add(new Average(-0.0012767242434782416,111));
    	remAverage.add(new Average(-0.030473585973913093,112));
    	remAverage.add(new Average(-0.13403405199130433,113));
    	remAverage.add(new Average(0.18686215345217394,114));
    	remAverage.add(new Average(-0.02125315958260869,115));
    	remAverage.add(new Average(-0.0681361701043479,116));
    	remAverage.add(new Average(0.09827238775652174,117));
    	remAverage.add(new Average(0.09556285118260868,118));
    	remAverage.add(new Average(0.14217759236521735,119));
    	remAverage.add(new Average(0.059042607060869626,120));
    	remAverage.add(new Average(0.13750718244347815,121));
    	remAverage.add(new Average(-0.011312984834782618,122));
    	remAverage.add(new Average(-0.034028769460869544,123));
    	remAverage.add(new Average(0.0306430929826087,124));
    	remAverage.add(new Average(0.003944229286956516,125));
    	remAverage.add(new Average(-0.02470096200869565,126));
    	remAverage.add(new Average(-0.032227055973913024,127));
    	remAverage.add(new Average(0.03896546040869574,128));
    	remAverage.add(new Average(-0.02071246188695651,129));
    	remAverage.add(new Average(-0.01138286723478265,130));
    	remAverage.add(new Average(-0.14022474080869557,131));
    	remAverage.add(new Average(0.10403415892173919,132));
    	remAverage.add(new Average(0.015780211356521735,133));
    	remAverage.add(new Average(0.06548220557391302,134));
    	remAverage.add(new Average(-0.07021117486956527,135));
    	remAverage.add(new Average(0.09903209802608698,136));
    	remAverage.add(new Average(-0.08505000237391294,137));
    	remAverage.add(new Average(0.10584921132173915,138));
    	remAverage.add(new Average(0.015872757469565225,139));
    	remAverage.add(new Average(0.07222524617391306,140));
    	remAverage.add(new Average(-0.010052320634782633,141));
    	remAverage.add(new Average(-0.06366626963478264,142));
    	remAverage.add(new Average(0.10140442132173906,143));
    	remAverage.add(new Average(0.1036564843565218,144));
    	remAverage.add(new Average(0.05400712756521739,145));
    	remAverage.add(new Average(-0.031354785582608694,146));
    	remAverage.add(new Average(0.02000695714782609,147));
    	remAverage.add(new Average(0.01761210271304344,148));
    	remAverage.add(new Average(-0.0829393990521739,149));
    	remAverage.add(new Average(-0.04933995237391303,150));
    	remAverage.add(new Average(-0.06181040997391303,151));
    	remAverage.add(new Average(-0.03757769459130429,152));
    	remAverage.add(new Average(0.032478470234782626,153));
    	remAverage.add(new Average(0.06169022170434784,154));
    	remAverage.add(new Average(0.01219952700869564,155));
    	remAverage.add(new Average(0.07463223288695654,156));
    	remAverage.add(new Average(0.0400923431652174,157));
    	remAverage.add(new Average(-0.04289828112173912,158));
    	remAverage.add(new Average(0.02508934841739132,159));
    	remAverage.add(new Average(0.060712441226086954,160));
    	remAverage.add(new Average(0.12586391404347813,161));
    	remAverage.add(new Average(0.037292734173913065,162));
    	remAverage.add(new Average(0.057144178852174064,163));
    	remAverage.add(new Average(-0.042237720486956516,164));
    	remAverage.add(new Average(-0.00982993047826086,165));
    	remAverage.add(new Average(0.06811051351304347,166));
    	remAverage.add(new Average(-0.05694730690434786,167));
    	remAverage.add(new Average(-0.003292869530434774,168));
    	remAverage.add(new Average(0.020296971504347804,169));
    	remAverage.add(new Average(-0.018095772695652216,170));
    	remAverage.add(new Average(0.22500922907826082,171));
    	remAverage.add(new Average(0.14550731466956526,172));
    	remAverage.add(new Average(0.03941688541739134,173));
    	remAverage.add(new Average(-0.07537099817391302,174));
    	remAverage.add(new Average(-0.017078214521739007,175));
    	remAverage.add(new Average(-0.11473581536521735,176));
    	remAverage.add(new Average(-0.04621968599130435,177));
    	remAverage.add(new Average(0.009801704530434791,178));
    	remAverage.add(new Average(-0.02812390272173909,179));
    	remAverage.add(new Average(0.012263228095652135,180));
    	remAverage.add(new Average(0.00976596027826088,181));
    	remAverage.add(new Average(0.15069373087826085,182));
    	remAverage.add(new Average(0.18568611346086955,183));
    	remAverage.add(new Average(0.0327522297130435,184));
    	remAverage.add(new Average(0.06355381727826087,185));
    	remAverage.add(new Average(0.11182583286086957,186));
    	remAverage.add(new Average(0.1417168984434783,187));
    	remAverage.add(new Average(0.09402424401739133,188));
    	remAverage.add(new Average(0.057061681565217355,189));
    	remAverage.add(new Average(0.022648415991304335,190));
    	remAverage.add(new Average(0.0746619377826087,191));
    	remAverage.add(new Average(-0.04481379219130436,192));
    	remAverage.add(new Average(0.09766241723478267,193));
    	remAverage.add(new Average(0.05640890751304361,194));
    	remAverage.add(new Average(0.15599950811304342,195));
    	remAverage.add(new Average(0.14539055953043487,196));
    	remAverage.add(new Average(0.13098526209565217,197));
    	remAverage.add(new Average(-0.047119068269565176,198));
    	remAverage.add(new Average(-0.011468355617391325,199));
    	remAverage.add(new Average(0.057988071939130435,200));
    	remAverage.add(new Average(0.13394750764347826,201));
    	remAverage.add(new Average(0.08514109953913039,202));
    	remAverage.add(new Average(0.0836273127565218,203));
    	remAverage.add(new Average(0.08044916581739137,204));
    	remAverage.add(new Average(-0.1281263207391304,205));
    	remAverage.add(new Average(-0.019644993017391327,206));
    	remAverage.add(new Average(-0.00483167225217393,207));
    	remAverage.add(new Average(0.11242879663478261,208));
    	remAverage.add(new Average(-0.0030887126434782667,209));
    	remAverage.add(new Average(-0.09840746862608694,210));
    	remAverage.add(new Average(0.04290491117391305,211));
    	remAverage.add(new Average(-0.028491344791304326,212));
    	remAverage.add(new Average(0.03864074056521739,213));
    	remAverage.add(new Average(-0.0785130342521739,214));
    	remAverage.add(new Average(-0.04946631687826087,215));
    	remAverage.add(new Average(0.12395974641739128,216));
    	remAverage.add(new Average(-4.561962260869632E-4,217));
    	remAverage.add(new Average(-0.19723824487826083,218));
    	remAverage.add(new Average(-0.024164952426086954,219));
    	remAverage.add(new Average(-0.05424247948695653,220));
    	remAverage.add(new Average(-0.0329338216,221));
    	remAverage.add(new Average(-0.05828681959130436,222));
    	remAverage.add(new Average(-0.009840525173913034,223));
    	remAverage.add(new Average(-0.02390901863478261,224));
    	remAverage.add(new Average(-0.013187622547826126,225));
    	remAverage.add(new Average(-4.7898582608695586E-4,226));
    	remAverage.add(new Average(0.0058281608608695724,227));
    	remAverage.add(new Average(0.06037136342608693,228));
    	remAverage.add(new Average(0.0769153134,229));
    	remAverage.add(new Average(-0.01564446422608697,230));
    	remAverage.add(new Average(-0.05113606756521732,231));
    	remAverage.add(new Average(-0.013357332495652172,232));
    	remAverage.add(new Average(-0.07341536412173913,233));
    	remAverage.add(new Average(5.743059130434525E-4,234));
    	remAverage.add(new Average(0.012104654156521748,235));
    	remAverage.add(new Average(0.07109739863478255,236));
    	remAverage.add(new Average(-0.015952418573912986,237));
    	remAverage.add(new Average(-0.11271386267826082,238));
    	remAverage.add(new Average(-0.10784288986956524,239));
    	remAverage.add(new Average(0.06789649998260869,240));
    	remAverage.add(new Average(0.08313818606086956,241));
    	remAverage.add(new Average(0.1033759862173913,242));
    	remAverage.add(new Average(-0.03697042630434783,243));
    	remAverage.add(new Average(-0.034369860434782656,244));
    	remAverage.add(new Average(0.09684467220869565,245));
    	remAverage.add(new Average(-0.022911752443478248,246));
    	remAverage.add(new Average(0.10108218729565221,247));
    	remAverage.add(new Average(-0.15501918531304348,248));
    	remAverage.add(new Average(0.08818078786086955,249));
    	remAverage.add(new Average(-0.06431130126086956,250));
    	remAverage.add(new Average(-0.054239533165217416,251));
    	remAverage.add(new Average(-0.04511710873043473,252));
    	remAverage.add(new Average(0.07374596467826092,253));
    	remAverage.add(new Average(0.014389036217391299,254));
    	remAverage.add(new Average(0.06444504236521743,255));
    	remAverage.add(new Average(0.025792394347826122,256));
    	remAverage.add(new Average(0.029048279486956482,257));
    	remAverage.add(new Average(0.12348484903478263,258));
    	remAverage.add(new Average(-0.03039925006086955,259));
    	remAverage.add(new Average(0.08933081527826085,260));
    	remAverage.add(new Average(-0.05871753701739129,261));
    	remAverage.add(new Average(0.09462612930434784,262));
    	remAverage.add(new Average(-0.10062411786956524,263));
    	remAverage.add(new Average(0.010977465643478256,264));
    	remAverage.add(new Average(0.017275088000000008,265));

    	
    	//populates avgResistant
    	resistAverage.add(new Average(62.82941176470589,2));
    	resistAverage.add(new Average(8.745098039215685,3));
    	resistAverage.add(new Average(39.91960784313725,12));
    	resistAverage.add(new Average(24505.727450980394,13));
    	resistAverage.add(new Average(50.878431372549024,14));
    	resistAverage.add(new Average(3.980392156862745,15));
    	resistAverage.add(new Average(1.392156862745098,16));
    	resistAverage.add(new Average(38.372549019607845,17));
    	resistAverage.add(new Average(9.05555555554902,18));
    	resistAverage.add(new Average(0.35294117647058826,19));
    	resistAverage.add(new Average(9.196078431372552,20));
    	resistAverage.add(new Average(70.31372549019608,21));
    	resistAverage.add(new Average(1730.38,22));
    	resistAverage.add(new Average(3.301960784313725,23));
    	resistAverage.add(new Average(0.6519999999999999,24));
    	resistAverage.add(new Average(1.0431372549019606,25));
    	resistAverage.add(new Average(415.0869565217391,26));
    	resistAverage.add(new Average(82.25294117647059,27));
    	resistAverage.add(new Average(74.44901960784314,28));
    	resistAverage.add(new Average(61.52745098039216,29));
    	resistAverage.add(new Average(18.374509803921566,30));
    	resistAverage.add(new Average(4.12156862745098,31));
    	resistAverage.add(new Average(0.7240000000000001,32));
    	resistAverage.add(new Average(82.56200000000001,33));
    	resistAverage.add(new Average(6.150980392156862,34));
    	resistAverage.add(new Average(0.03663581207843138,35));
    	resistAverage.add(new Average(0.026765880568627488,36));
    	resistAverage.add(new Average(-0.0670784582156863,37));
    	resistAverage.add(new Average(-0.032125984137254905,38));
    	resistAverage.add(new Average(0.018974447627450992,39));
    	resistAverage.add(new Average(-0.17957946452941173,40));
    	resistAverage.add(new Average(0.25874199245098034,41));
    	resistAverage.add(new Average(0.08337919603921569,42));
    	resistAverage.add(new Average(-0.022425508843137206,43));
    	resistAverage.add(new Average(-0.16639257909803923,44));
    	resistAverage.add(new Average(0.1958005794117647,45));
    	resistAverage.add(new Average(-0.080847559627451,46));
    	resistAverage.add(new Average(-0.017478025607843155,47));
    	resistAverage.add(new Average(-0.15615031574509802,48));
    	resistAverage.add(new Average(-0.033256818176470575,49));
    	resistAverage.add(new Average(0.05604844037254903,50));
    	resistAverage.add(new Average(0.010623510509803931,51));
    	resistAverage.add(new Average(-0.15420626876470592,52));
    	resistAverage.add(new Average(0.07101991458823531,53));
    	resistAverage.add(new Average(0.06945504911764706,54));
    	resistAverage.add(new Average(-0.02685017527450991,55));
    	resistAverage.add(new Average(-0.11446469754901961,56));
    	resistAverage.add(new Average(-0.026526179607843158,57));
    	resistAverage.add(new Average(0.020310293137254902,58));
    	resistAverage.add(new Average(0.036723969137254925,59));
    	resistAverage.add(new Average(-0.04825740470588236,60));
    	resistAverage.add(new Average(-0.20566313258823535,61));
    	resistAverage.add(new Average(-0.19614053586274513,62));
    	resistAverage.add(new Average(0.06244731235294124,63));
    	resistAverage.add(new Average(-0.17177445917647058,64));
    	resistAverage.add(new Average(-0.030609060019607823,65));
    	resistAverage.add(new Average(-0.036824396313725555,66));
    	resistAverage.add(new Average(-0.14874099713725486,67));
    	resistAverage.add(new Average(-0.09938293003921568,68));
    	resistAverage.add(new Average(-0.043787415215686264,69));
    	resistAverage.add(new Average(-0.11744165672549019,70));
    	resistAverage.add(new Average(-0.04409227268627448,71));
    	resistAverage.add(new Average(-0.16182459960784312,72));
    	resistAverage.add(new Average(-0.10671804872549019,73));
    	resistAverage.add(new Average(-0.12961640327450982,74));
    	resistAverage.add(new Average(-0.19196670131372548,75));
    	resistAverage.add(new Average(-0.1262205868627451,76));
    	resistAverage.add(new Average(-0.20502559452941174,77));
    	resistAverage.add(new Average(-0.02836789978431374,78));
    	resistAverage.add(new Average(-0.1995803068627451,79));
    	resistAverage.add(new Average(0.17625392229411768,80));
    	resistAverage.add(new Average(-0.16567648649019603,81));
    	resistAverage.add(new Average(-0.09193318815686269,82));
    	resistAverage.add(new Average(0.05534046982352938,83));
    	resistAverage.add(new Average(-0.002284368901960793,84));
    	resistAverage.add(new Average(-0.2394847978039216,85));
    	resistAverage.add(new Average(-0.04547942854901962,86));
    	resistAverage.add(new Average(-0.10430732205882352,87));
    	resistAverage.add(new Average(0.052562081627450914,88));
    	resistAverage.add(new Average(0.07291668180392154,89));
    	resistAverage.add(new Average(0.06644325684313726,90));
    	resistAverage.add(new Average(0.09286331131372547,91));
    	resistAverage.add(new Average(-0.1980549912156863,92));
    	resistAverage.add(new Average(-0.1478331111764706,93));
    	resistAverage.add(new Average(0.024775791215686266,94));
    	resistAverage.add(new Average(0.17362970411764705,95));
    	resistAverage.add(new Average(-0.11883453019607843,96));
    	resistAverage.add(new Average(0.14322426372549016,97));
    	resistAverage.add(new Average(0.04819901300000003,98));
    	resistAverage.add(new Average(0.19339114411764705,99));
    	resistAverage.add(new Average(0.03801904498039215,100));
    	resistAverage.add(new Average(-0.014963671803921554,101));
    	resistAverage.add(new Average(-0.028914140450980372,102));
    	resistAverage.add(new Average(-0.1858666578627451,103));
    	resistAverage.add(new Average(0.27493284819607855,104));
    	resistAverage.add(new Average(0.13635344082352938,105));
    	resistAverage.add(new Average(-0.09888435378431368,106));
    	resistAverage.add(new Average(-0.05194614201960784,107));
    	resistAverage.add(new Average(-0.17342667976470594,108));
    	resistAverage.add(new Average(0.13158295900000003,109));
    	resistAverage.add(new Average(-0.0703524100588235,110));
    	resistAverage.add(new Average(0.001538986823529415,111));
    	resistAverage.add(new Average(0.11080775533333331,112));
    	resistAverage.add(new Average(0.11132223629411765,113));
    	resistAverage.add(new Average(-0.055304902921568644,114));
    	resistAverage.add(new Average(-0.042082362352941154,115));
    	resistAverage.add(new Average(0.10551356456862744,116));
    	resistAverage.add(new Average(-0.10088281531372548,117));
    	resistAverage.add(new Average(-0.062054921784313724,118));
    	resistAverage.add(new Average(-0.04274181698039215,119));
    	resistAverage.add(new Average(0.0791349775686275,120));
    	resistAverage.add(new Average(-0.018693732705882368,121));
    	resistAverage.add(new Average(0.05602337466666667,122));
    	resistAverage.add(new Average(0.08685971686274507,123));
    	resistAverage.add(new Average(-0.03689412617647062,124));
    	resistAverage.add(new Average(-0.22805561352941175,125));
    	resistAverage.add(new Average(0.19847964970588236,126));
    	resistAverage.add(new Average(0.032172090901960805,127));
    	resistAverage.add(new Average(-0.19804480245098036,128));
    	resistAverage.add(new Average(-0.016943167215686256,129));
    	resistAverage.add(new Average(-0.027851683078431347,130));
    	resistAverage.add(new Average(-0.07609802313725496,131));
    	resistAverage.add(new Average(-0.1233621609019608,132));
    	resistAverage.add(new Average(-0.07402060676470588,133));
    	resistAverage.add(new Average(-0.1689223507843137,134));
    	resistAverage.add(new Average(-0.08692121182352938,135));
    	resistAverage.add(new Average(-0.11375854092156867,136));
    	resistAverage.add(new Average(-0.0029375870392156977,137));
    	resistAverage.add(new Average(-0.08773431009803925,138));
    	resistAverage.add(new Average(0.014082466901960765,139));
    	resistAverage.add(new Average(-0.03405489388235292,140));
    	resistAverage.add(new Average(0.0462199358627451,141));
    	resistAverage.add(new Average(0.09735744958823528,142));
    	resistAverage.add(new Average(-0.09581305192156864,143));
    	resistAverage.add(new Average(-0.17370681058823534,144));
    	resistAverage.add(new Average(-0.12917640529411759,145));
    	resistAverage.add(new Average(0.12304643754901956,146));
    	resistAverage.add(new Average(0.1253490545882353,147));
    	resistAverage.add(new Average(0.06166324182352939,148));
    	resistAverage.add(new Average(0.08018655215686273,149));
    	resistAverage.add(new Average(-0.008838962745098041,150));
    	resistAverage.add(new Average(0.021811920392156868,151));
    	resistAverage.add(new Average(0.1417865503529412,152));
    	resistAverage.add(new Average(0.026996683803921576,153));
    	resistAverage.add(new Average(0.1047277744313726,154));
    	resistAverage.add(new Average(-0.14026497698039217,155));
    	resistAverage.add(new Average(-0.1531221144117647,156));
    	resistAverage.add(new Average(0.06246300666666667,157));
    	resistAverage.add(new Average(-0.010070303725490172,158));
    	resistAverage.add(new Average(-0.04825154903921564,159));
    	resistAverage.add(new Average(-0.08558451488235293,160));
    	resistAverage.add(new Average(0.05301062037254902,161));
    	resistAverage.add(new Average(0.009356939431372545,162));
    	resistAverage.add(new Average(0.01026895807843139,163));
    	resistAverage.add(new Average(0.20137461109803922,164));
    	resistAverage.add(new Average(-0.223621979372549,165));
    	resistAverage.add(new Average(-0.23473523437254903,166));
    	resistAverage.add(new Average(0.06706004947058825,167));
    	resistAverage.add(new Average(-0.12211147237254903,168));
    	resistAverage.add(new Average(-0.04547252615686276,169));
    	resistAverage.add(new Average(0.36868321011764693,170));
    	resistAverage.add(new Average(-0.01259285292156865,171));
    	resistAverage.add(new Average(-0.10462472619607843,172));
    	resistAverage.add(new Average(-0.14307224903921573,173));
    	resistAverage.add(new Average(-0.024458343039215687,174));
    	resistAverage.add(new Average(0.0948422665294117,175));
    	resistAverage.add(new Average(-0.019668947549019638,176));
    	resistAverage.add(new Average(0.027025541137254916,177));
    	resistAverage.add(new Average(0.1179369390784314,178));
    	resistAverage.add(new Average(-0.04242233745098039,179));
    	resistAverage.add(new Average(-0.25979656741176477,180));
    	resistAverage.add(new Average(-0.07024801905882352,181));
    	resistAverage.add(new Average(-0.019772838176470638,182));
    	resistAverage.add(new Average(-0.2612692569019608,183));
    	resistAverage.add(new Average(0.03772164037254901,184));
    	resistAverage.add(new Average(-0.057667483156862744,185));
    	resistAverage.add(new Average(-0.05920177568627457,186));
    	resistAverage.add(new Average(-0.183097201745098,187));
    	resistAverage.add(new Average(-0.1284782517647059,188));
    	resistAverage.add(new Average(-0.13100971449019613,189));
    	resistAverage.add(new Average(-0.046149129117647014,190));
    	resistAverage.add(new Average(0.018170867137254937,191));
    	resistAverage.add(new Average(0.14234038466666668,192));
    	resistAverage.add(new Average(-0.09901344915686272,193));
    	resistAverage.add(new Average(-0.0674601640392157,194));
    	resistAverage.add(new Average(-0.14275567788235294,195));
    	resistAverage.add(new Average(-0.15428018652941175,196));
    	resistAverage.add(new Average(-0.029163542274509794,197));
    	resistAverage.add(new Average(-0.04151600505882353,198));
    	resistAverage.add(new Average(0.16213006747058825,199));
    	resistAverage.add(new Average(-0.03674492423529412,200));
    	resistAverage.add(new Average(-0.10276541456862746,201));
    	resistAverage.add(new Average(-0.15503766703921573,202));
    	resistAverage.add(new Average(-0.21899440999999994,203));
    	resistAverage.add(new Average(0.023374939960784335,204));
    	resistAverage.add(new Average(0.007574612568627435,205));
    	resistAverage.add(new Average(0.10919785686274511,206));
    	resistAverage.add(new Average(0.032258801235294086,207));
    	resistAverage.add(new Average(-0.09383468754901961,208));
    	resistAverage.add(new Average(-0.015127901843137222,209));
    	resistAverage.add(new Average(0.1551702743529412,210));
    	resistAverage.add(new Average(0.00903821015686275,211));
    	resistAverage.add(new Average(-0.2553761149019607,212));
    	resistAverage.add(new Average(0.06674079299999999,213));
    	resistAverage.add(new Average(-0.032418823392156855,214));
    	resistAverage.add(new Average(0.005669598549019618,215));
    	resistAverage.add(new Average(-0.12831119856862744,216));
    	resistAverage.add(new Average(-0.05205972125490196,217));
    	resistAverage.add(new Average(0.1921285922745098,218));
    	resistAverage.add(new Average(0.10303701845098037,219));
    	resistAverage.add(new Average(0.20132108784313715,220));
    	resistAverage.add(new Average(0.15240262376470587,221));
    	resistAverage.add(new Average(0.18586080590196083,222));
    	resistAverage.add(new Average(0.041295147588235326,223));
    	resistAverage.add(new Average(0.0756733699215686,224));
    	resistAverage.add(new Average(0.05680273805882351,225));
    	resistAverage.add(new Average(-0.21747799050980396,226));
    	resistAverage.add(new Average(-0.13124053198039218,227));
    	resistAverage.add(new Average(-0.03839871578431371,228));
    	resistAverage.add(new Average(-0.2385433790392157,229));
    	resistAverage.add(new Average(-0.122127803117647,230));
    	resistAverage.add(new Average(0.0643137025490196,231));
    	resistAverage.add(new Average(-0.19617151747058825,232));
    	resistAverage.add(new Average(0.06479038835294121,233));
    	resistAverage.add(new Average(0.19491455041176473,234));
    	resistAverage.add(new Average(-0.1440039387843137,235));
    	resistAverage.add(new Average(-0.1656987143137255,236));
    	resistAverage.add(new Average(0.01537255549019603,237));
    	resistAverage.add(new Average(-0.07929205578431374,238));
    	resistAverage.add(new Average(0.0012643587647058773,239));
    	resistAverage.add(new Average(0.048836185843137286,240));
    	resistAverage.add(new Average(-0.08882274423529415,241));
    	resistAverage.add(new Average(-0.14995495021568636,242));
    	resistAverage.add(new Average(0.12315932141176478,243));
    	resistAverage.add(new Average(-0.08356705372549018,244));
    	resistAverage.add(new Average(-0.1493556137843137,245));
    	resistAverage.add(new Average(0.16706823368627455,246));
    	resistAverage.add(new Average(-0.2254287918431373,247));
    	resistAverage.add(new Average(0.1232772489019608,248));
    	resistAverage.add(new Average(0.06411108162745092,249));
    	resistAverage.add(new Average(-0.04117993747058824,250));
    	resistAverage.add(new Average(0.04562929996078428,251));
    	resistAverage.add(new Average(0.1811966330784314,252));
    	resistAverage.add(new Average(-0.0524224171764706,253));
    	resistAverage.add(new Average(0.12272468068627457,254));
    	resistAverage.add(new Average(0.09265256521568627,255));
    	resistAverage.add(new Average(0.04353560494117648,256));
    	resistAverage.add(new Average(0.09994190929411761,257));
    	resistAverage.add(new Average(0.001206798450980409,258));
    	resistAverage.add(new Average(0.06311671496078432,259));
    	resistAverage.add(new Average(-0.21428948337254902,260));
    	resistAverage.add(new Average(-0.060537157647058755,261));
    	resistAverage.add(new Average(-0.08287992494117644,262));
    	resistAverage.add(new Average(-0.08412860962745099,263));
    	resistAverage.add(new Average(0.07396607221568625,264));
    	resistAverage.add(new Average(-0.1240709847647059,265));
    }
	
	public static ArrayList<String> PropertyElements(int column) {
		
		ArrayList<String> result = new ArrayList<String>();
		result.add(patients.get(1).properties[column].propertyValue);
			
		for(int i=1; i<patients.size();i++) {
			String value = patients.get(i).properties[column].propertyValue;
			int duplicates = 0;
			for(int j = 0; j<result.size(); j++){
				if(value.equals(result.get(j)))
					duplicates++;
				}
			if(duplicates==0)
				result.add(value);
			}	
		return result;
	}
	
}

class Patient{
	Property[] properties;
	
	public Patient(Property[] s){	
		properties = s;
	}
}

class Property {
	String propertyValue;
	int column;
	
	public Property(String a, int b) {
		propertyValue = a;
		column = b;
	}
}

class PropertyImport {
	public String[] properties;
	public Property[] finalprops = new Property[269];
	
	public PropertyImport(String s){	
		properties = s.split("	");
		setProperties();
	}
	
	public void setProperties() {
    	
		for(int i = 0; i < properties.length; i++)
		{
			Property a = new Property(properties[i], i);
			finalprops[i] = a;
		}
	}
}

class Average {
	public Double average;
	public int index;
	
	public Average (Double a, int i){
		this.average = a;
		this.index = i;
	}

}
