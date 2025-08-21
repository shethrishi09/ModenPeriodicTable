
import java.util.Scanner;
class PeriodicTable2{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
Main m1=new Main();}}
class Main{
	Scanner sc=new Scanner(System.in);
	Main(){
System.out.println(" ------------------------- ");
System.out.println(" ||Modern Periodic Table|| ");
System.out.println(" ------------------------- ");
		boolean f=true;
		while(f){
System.out.println(" ------------------------------------------");
System.out.println(" ||Enter 1 for Modern Periodic Table     ||");
System.out.println(" ||Enter 2 for properties of each element||");
System.out.println(" ||Enter 3 to exit                       ||");
System.out.println("-------------------------------------------");
int n=sc.nextInt();
switch(n){
	case 1:{
System.out.println("-------------------------------------------------------------------------------------------------");
System.out.println("    |1 | |2 | |3 | |4 | |5 | |6 | |7 | |8 | |9 | |10| |11| |12| |13 | |14| |15 | |16| |17 | |18 |");
System.out.println("-------------------------------------------------------------------------------------------------");		
System.out.println("|1| |H |                                                                                    |He |");
System.out.println("-------------------------------------------------------------------------------------------------");
System.out.println("|2| |Li| |Be|                                                   |B  | |C | |N  | |O | |F  | |Ne |");
System.out.println("-------------------------------------------------------------------------------------------------");
System.out.println("|3| |Na| |Mg|                                                   |Al | |Si| |P  | |S | |Cl | |Ar |");
System.out.println("-------------------------------------------------------------------------------------------------");
System.out.println("|4| |K | |Ca| |Sc| |Ti| |V | |Cr| |Mn| |Fe| |Co| |Ni| |Cu| |Zn| |Ga | |Ge| |As | |Se| |Br | |Kr |");
System.out.println("-------------------------------------------------------------------------------------------------");
System.out.println("|5| |Rb| |Sr| |Y | |Zr| |Nb| |Mo| |Tc| |Ru| |Rh| |Pd| |Ag| |Cd| |In | |Sn| |Sb | |Te| |I  | |Xe |");
System.out.println("-------------------------------------------------------------------------------------------------");
System.out.println("|6| |Cs| |Ba| |La| |Hf| |Ta| |W | |Re| |Os| |Ir| |Pt| |Au| |Hg| |Ti | |Pb| |Bi | |Po| |At | |Rn |");
System.out.println("-------------------------------------------------------------------------------------------------");
System.out.println("|7| |Fr| |Ra| |Ac| |Rf| |Db| |Sg| |Bh| |Hs| |Mt| |Ds| |Rg| |Cn| |Uut| |Fi| |Uup| |Lv| |Uus| |Uuo|");
System.out.println("-------------------------------------------------------------------------------------------------");
System.out.println("||LANTHANIDE||     |La| |Ce| |Pr| |Nd| |Pm| |Sm| |Eu| |Gd| |Tb| |Dy | |Ho| |Er | |Tm| |Yb | |Lu |");
System.out.println("-------------------------------------------------------------------------------------------------");
System.out.println("||ACTINIDE||       |Ac| |Th| |Pa| |U | |Np| |Pu| |Am| |Cm| |Bk| |Cf | |Es| |Fm | |Md| |No | |Lr |");
System.out.println("-------------------------------------------------------------------------------------------------");
break;}
case 2:{
	boolean c=true;
	while(c){
System.out.println("------------------------------");		
System.out.println("||Enter atomic no of element||");
System.out.println("------------------------------");
System.out.println("-------------------");
System.out.println("||ENTER 0 TO EXIT||");
System.out.println("-------------------");
int s=sc.nextInt();
switch(s){
	case 0:{
		c=false;
	break;}
	case 1:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Hydrogen      | 1              | Reactive nonmetal, diatomic gas                         |");
	break;}
	case 2:{
		System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
		System.out.println("| Helium        | 2              | Inert gas, colorless, odorless                          |");
	break;}
	case 3:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
		System.out.println("| Lithium       | 3              | Alkali metal, soft, silvery-white                       |");
	break;}
	case 4:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Beryllium     | 4              | Alkaline earth metal, hard, strong, lightweight         |");
break;}
	case 5:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Boron         | 5              | Metalloid, low abundance, used in ceramics               |");
break;}
	case 6:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Carbon        | 6              | Nonmetal, basis of organic chemistry                     |");
break;}
	case 7:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Nitrogen      | 7              | Nonmetal, makes up majority of Earth's atmosphere        |");
                       break;}
	case 8:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Oxygen        | 8              | Nonmetal, essential for respiration                     |");
break;}
	case 9:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Fluorine      | 9              | Halogen, highly reactive, pale yellow gas               |");
break;}
	case 10:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Neon          | 10             | Inert gas, glows reddish-orange in a vacuum             |");
break;}
	case 11:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Sodium        | 11             | Alkali metal, soft, reactive metal                      |");
break;}
	case 12:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
          System.out.println("| Magnesium     | 12             | Alkaline earth metal, lightweight, strong                |");
break;	}
	case 13:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Aluminum      | 13             | Metal, lightweight, strong, corrosion-resistant          |");
break;	}
	case 14:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Silicon       | 14             | Metalloid, second most abundant element in Earth's crust  |");
break;	}
	case 15:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Phosphorus    | 15             | Nonmetal, essential for life, found in DNA and RNA       |");
break;}
	case 16:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Sulfur        | 16             | Nonmetal, bright yellow solid, essential for life        |");
break;}
	case 17:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Chlorine      | 17             | Halogen, greenish-yellow gas, used for disinfection      |");
break;}
	case 18:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
      System.out.println("| Argon         | 18             | Inert gas, used in various applications                  |");
break;}
	case 19:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Potassium     | 19             | Alkali metal, soft, reactive metal                      |");
break;}
	case 20:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Calcium       | 20             | Alkaline earth metal, essential for bones and teeth      |");
break;}
	case 21:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Scandium      | 21             | Transition metal, lightweight, corrosion-resistant      |");
break;	}
	case 22:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Titanium      | 22             | Transition metal, strong, lightweight                    |");
break;}
	case 23:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Vanadium      | 23             | Transition metal, used in steel alloys                   |");
break;}
	case 24:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Chromium      | 24             | Transition metal, shiny, corrosion-resistant             |");
break;}
	case 25:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Manganese     | 25             | Transition metal, essential for biological processes     |");
break;}
	case 26:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Iron          | 26             | Transition metal, essential for hemoglobin               |");
	break;}
	case 27:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Cobalt        | 27             | Transition metal, used in rechargeable batteries         |");
break;	}
	case 28:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Nickel        | 28             | Transition metal, shiny, corrosion-resistant             |");
break;}
	case 29:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Copper        | 29             | Transition metal, malleable, good conductor of heat      |");
break;}
case 30:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Zinc          | 30             | Transition metal, essential for enzymes                  |");
break;}
	case 31:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Gallium       | 31             | Metal, low melting point, used in semiconductors         |");
break;}
	case 32:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Germanium     | 32             | Metalloid, used in electronics                           |");
break;}
	case 33:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Arsenic       | 33             | Metalloid, toxic, used in semiconductor devices          |");
break;}
	case 34:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Selenium      | 34             | Nonmetal, essential trace element                        |");
break;}
	case 35:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Bromine       | 35             | Halogen, volatile liquid, reddish-brown                  |");
break;}
	case 36:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Krypton       | 36             | Noble gas, used in lighting and lasers                   |");
break;}
	case 37:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Rubidium      | 37             | Alkali metal, soft, silvery-white                        |");

	break;}
	case 38:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Strontium     | 38             | Alkaline earth metal, used in fireworks                  |");
break;}
	case 39:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Yttrium       | 39             | Transition metal, used in alloys and ceramics            |");
break;}
	case 40:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Zirconium     | 40             | Transition metal, corrosion-resistant                     |");
break;}
	case 41:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Niobium       | 41             | Transition metal, used in superconducting magnets        |");
break;}
	case 42:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Molybdenum    | 42             | Transition metal, essential for plant growth             |");
break;}
	case 43:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Technetium    | 43             | Transition metal, radioactive, used in medical imaging    |");
break;}
	case 44:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
          System.out.println("| Ruthenium     | 44             | Transition metal, rare, used in electronics              |");

	break;}
	case 45:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Rhodium       | 45             | Transition metal, rare, used in catalytic converters     |");
break;}
	case 46:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
 System.out.println("| Palladium     | 46             | Transition metal, rare, used in catalytic converters     |");

	break;}
	case 47:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
          System.out.println("| Silver        | 47             | Transition metal, precious metal, used in currency       |");
break;}
	case 48:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
           System.out.println("| Cadmium       | 48             | Transition metal, toxic, used in batteries               |");
break;}
	case 49:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
            System.out.println("| Indium        | 49             | Metal, soft, used in electronics                         |");
	break;}
	case 50:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
    System.out.println("| Tin           | 50             | Metal, malleable, used in alloys and coatings            |");
break;}
	case 51:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Antimony      | 51             | Metalloid, brittle, used in flame retardants             |");
break;}
	case 52:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Tellurium     | 52             | Metalloid, brittle, used in solar panels                |");
break;}
	case 53:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Iodine        | 53             | Halogen, purple-black solid, used in medicine           |");
break;}
	case 54:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
          System.out.println("| Xenon         | 54             | Noble gas, used in lighting and anesthesia               |");
		  break;}
	case 55:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Cesium        | 55             | Alkali metal, soft, gold-colored, used in atomic clocks |");
	break;}
	case 56:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Barium        | 56             | Alkaline earth metal, used in medicine and fireworks    |");
break;}
	case 57:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Lanthanum     | 57             | Lanthanide, reactive, used in high-strength alloys      |");
break;}
	case 58:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Cerium        | 58             | Lanthanide, used in catalysts and self-cleaning ovens   |");
		break;}
	case 59:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Praseodymium  | 59             | Lanthanide, used in magnets and lasers                  |");
break;}
	case 60:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Neodymium     | 60             | Lanthanide, used in magnets and lasers                  |");
break;}
	case 61:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Promethium    | 61             | Lanthanide, radioactive, used in nuclear batteries      |");
break;}
	case 62:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
System.out.println("| Samarium      | 62             | Lanthanide, used in magnets and nuclear reactors        |");
break;}
	case 63:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Europium      | 63             | Lanthanide, used in phosphors for color displays        |");
break;}
	case 64:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
          System.out.println("| Gadolinium    | 64             | Lanthanide, used in MRI contrast agents                 |");

	break;}
	case 65:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Terbium       | 65             | Lanthanide, used in fluorescent lamps                   |");
break;}
	case 66:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Dysprosium    | 66             | Lanthanide, used in magnets and lasers                  |");
break;}
	case 67:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Holmium       | 67             | Lanthanide, used in magnets and lasers                  |");
break;}
	case 68:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Erbium        | 68             | Lanthanide, used in optical fibers                      |");
break;}
	case 69:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Thulium       | 69             | Lanthanide, used in portable X-ray machines             |");
break;}
	case 70:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Ytterbium     | 70             | Lanthanide, used in laser technologies                  |");

break;}
case 71:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Lutetium      | 71             | Lanthanide, used in catalysts and LED lighting          |");
      
break;}
case 72:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Hafnium       | 72             | Transition metal, used in nuclear reactors               |");

break;}
case 73:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Tantalum      | 73             | Transition metal, used in capacitors and turbines       |");

break;}
case 74:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Tungsten      | 74             | Transition metal, used in light bulb filaments           |");

break;}
case 75:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Rhenium       | 75             | Transition metal, used in high-temperature alloys        |");

break;}
case 76:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
 System.out.println("| Osmium        | 76             | Transition metal, densest naturally occurring element    |");

break;}
case 77:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Iridium       | 77             | Transition metal, used in spark plugs and jewelry        |");

break;}
case 78:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Platinum      | 78             | Transition metal, precious metal, used in jewelry        |");

break;}
case 79:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
      System.out.println("| Gold          | 79             | Transition metal, precious metal, used in jewelry        |");

break;}
case 80:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Mercury       | 80             | Transition metal, liquid at room temperature             |");

break;}
case 81:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
 System.out.println("| Thallium      | 81             | Metal, soft, used in electronics and medicine           |");

break;}
case 82:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Lead          | 82             | Metal, dense, used in batteries and radiation shielding |");

break;}
case 83:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
     System.out.println("| Bismuth       | 83             | Metal, brittle, used in cosmetics and medicine          |");

break;} 
case 84:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Polonium      | 84             | Metal, highly radioactive, used in nuclear batteries    |");

break;}
case 85:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Astatine      | 85             | Halogen, highly radioactive, rarely occurring            |");

break;}
case 86:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Radon         | 86             | Noble gas, radioactive, used in cancer treatment         |");

break;}
case 87:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
System.out.println("| Francium      | 87             | Alkali metal, highly radioactive, rare                  |");

break;}
case 88:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Radium        | 88             | Alkaline earth metal, highly radioactive                |");

break;}
case 89:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Actinium      | 89             | Actinide, radioactive, used in medicine                 |");

break;}
case 90:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Thorium       | 90             | Actinide, radioactive, used in nuclear reactors         |");

break;}
case 91:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Protactinium  | 91             | Actinide, radioactive, used in scientific research      |");

break;}
case 92:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
      System.out.println("| Uranium       | 92             | Actinide, radioactive, used in nuclear power plants     |");

break;}
case 93:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Neptunium     | 93             | Actinide, radioactive, used in nuclear reactors         |");

break;}
case 94:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
System.out.println("| Plutonium     | 94             | Actinide, radioactive, used in nuclear weapons          |");

break;}
case 95:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
 System.out.println("| Americium     | 95             | Actinide, radioactive, used in smoke detectors           |");

break;}
case 96:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
System.out.println("| Curium        | 96             | Actinide, radioactive, used in scientific research      |");

break;}
case 97:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
System.out.println("| Berkelium     | 97             | Actinide, radioactive, used in scientific research      |");

break;}
case 98:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Californium   | 98             | Actinide, radioactive, used in scientific research      |");

break;}
case 99:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Einsteinium   | 99             | Actinide, radioactive, produced in nuclear reactions    |");

break;}
case 100:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Fermium       | 100            | Actinide, radioactive, produced in nuclear reactions    |");

break;}
case 101:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Mendelevium   | 101            | Actinide, radioactive, produced in nuclear reactions    |");

break;}
case 102:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Nobelium      | 102            | Actinide, radioactive, produced in nuclear reactions    |");

break;}
case 103:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Lawrencium    | 103            | Actinide, radioactive, produced in nuclear reactions    |");

break;}
case 104:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Rutherfordium | 104            | Transition metal, synthetic element                      |");

break;}
case 105:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Dubnium       | 105            | Transition metal, synthetic element                      |");

break;}
case 106:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Seaborgium    | 106            | Transition metal, synthetic element                      |");

break;}
case 107:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Bohrium       | 107            | Transition metal, synthetic element                      |");

break;}
case 108:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
      System.out.println("| Hassium       | 108            | Transition metal, synthetic element                      |");

break;}
case 109:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
     System.out.println("| Meitnerium    | 109            | Synthetic element, radioactive                           |");

break;}
case 110:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Darmstadtium  | 110            | Synthetic element, radioactive                           |");

break;}
case 111:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Roentgenium   | 111            | Synthetic element, radioactive                           |");

break;}
case 112:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
 System.out.println("| Copernicium   | 112            | Synthetic element, radioactive                           |");

break;}
case 113:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Nihonium      | 113            | Synthetic element, radioactive                           |");

break;}
case 114:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
         System.out.println("| Flerovium     | 114            | Synthetic element, radioactive                           |");

break;}
case 115:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
       System.out.println("| Moscovium     | 115            | Synthetic element, radioactive                           |");

break;}
case 116:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
      System.out.println("| Livermorium   | 116            | Synthetic element, radioactive                           |");

break;}
case 117:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Tennessine    | 117            | Synthetic element, radioactive                           |");

break;}
case 118:{
        System.out.println("| Element       | Atomic Number  | Chemical Properties                                    |");
        System.out.println("|---------------|----------------|--------------------------------------------------------|");
        System.out.println("| Oganesson     | 118            | Synthetic element, radioactive                           |");

break;} 
	}}
break;
	}
case 3:{
	System.out.println("-----------------");
	System.out.println(" |||THANK YOU |||");
	System.out.println("-----------------");
	f=false;
	break;}}}
       
}}