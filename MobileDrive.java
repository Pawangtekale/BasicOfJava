class MobileDrive 
{
	public static void main(String[] args) 
	{
		// First Mobile _____________________________________
		Mobile m1=new Mobile();
	    m1.brand="Apple"; 
	    m1.price=54999;        
	    m1.colour="Silver";       
	    m1.seller="BTPLD";  
	    m1.description="Stay productive and improve your performance with the Super Retina XDR display that is comfortable for the eyes. Powered with a 12 MP main camera, enjoy taking pictures with friends and family. ";
	    m1.modelNumber="MPV03HN/A";
	    m1.modelName="iPhone 14";
	    m1.browseType="Smartphones";
		m1.displayMobile();
		//Second Mobile_______________________________________________
		Mobile m2=new Mobile();
		m2.brand="vivo";
		m2.price=14999;
		m2.colour="Gray";
		m2.seller="Flashtech Retail";
		m2.description="NA";
		m2.modelNumber="V2437";
		m2.modelName="T4x 5G";
		m1.browseType="Smartphones";
		m2.displayMobile();
		
		// Third Mobile ____________________________________________
		Mobile m3=new Mobile();
		m3.brand="SAMSUNG";
		m3.price=859;
		m3.colour="Black";
		m3.seller="Khanna77";
		m3.description="Samsung Guru music 2 proves otherwise. It comes with 16 GB of expandable memory which is large enough to store up to 3000 songs. This phone also features an advanced MP3 player and powerful loudspeakers so you feel your music.";
		m3.modelNumber="GURU MUSIC 2";
		m3.modelName="Guru Music 2 B310ED";
		m3.browseType="Feature Phones";
		m3.displayMobile();
		
		
		
	}
		
}
