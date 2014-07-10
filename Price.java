class MobileSpecification
  {
   private String name;
   private double screenSize;
   private int battery;
   private double camera;
   private String processor;
   private int price;
   
   /*
      input :   
      output : Mobile name
      Description :  Displays the name of the Handset
    */
      // setname()

       /*
      input :   
      output : Mobiles screensize in inches
      Description :  Displays the screen size of the Handset
    */
    //setScreenSize()
    /*
      input :   
      output : Battery capacity in mAh
      Description :  Displays the usage duration of a mobile 
    */
    //setBattery()
    /*
      input :   
      output : camera quality in mp
      Description :  Displays the picture quality of camera of a mobile 
    */
    //setCamera()
    /*
      input :   
      output : processing speed
      Description :  Displays the speed and no of cores of a mobile 
    */
    //setProcessor()
    /*
      input :   
      output : price
      Description :  Displays the price of a mobile 
    */
    setPrice()
    spec(String n,double scr,int b,double c,String p,int budget)
    {
    name = n;
    screenSize = scr;
    battery = b;
    camera = c;
    processor = p;
    price=budget;
    }
    
   