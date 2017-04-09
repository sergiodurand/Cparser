package uml2bsv;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.List;

import lcr.c2bsv.parser.C2BSVParser;
import lcr.c2bsv.parser.ParseException;
import lcr.c2bsv.parser.SimpleNode;
import lcr.c2bsv.parser.Symbol;

public class UML2BSV {

	public static void main(String[] args) throws ParseException {
		System.out.println("UML + C -> BSV Compiler (20120610)\n");
	
		//String str = "result = (i + x[j]) * z;";
		//String str = "result = i00* -1 + i01*-2 + i02*-1 + i20 + 2*i21 + i22;";
		//String str = "result = i00* +1;";
		//String str = "r = ImageSource.put(0, 114, 0);";
		//String str = "r = ImageSource.put(1, 114, 250);";
		//String str = "reg[rx] = memory.get(0);";
		
		String str = "x = 9 / (1 + 3) * 4 + 5;";
		//String str = "while (x == 1) {};";
		System.out.println("Source code:\n" + str);
		
		Symbol st1 = new Symbol();
		st1.setName("memory");
		st1.setType(Symbol.Type.BRAM);

		Symbol st2 = new Symbol();
		st2.setName("pc");
		st2.setType(Symbol.Type.PRIMITIVE);

		
		InputStream is = new ByteArrayInputStream(str.getBytes());
		C2BSVParser parser = new C2BSVParser(is);
		//C2BSVParser parser = new C2BSVParser(is, st1);

		
		//parser.setSsymbolTable(new ArrayList<Symbol>());
		//parser.getSsymbolTable().add(st1);
		//parser.getSsymbolTable().add(st2);
		
		SimpleNode root = parser.TranslationUnit();
		//root.setSymbolTable(new ArrayList<Symbol>());
		//root.getSymbolTable().add(st1);
		//root.getSymbolTable().add(st2);
		
		root.dump("-");
		//root.setSymbolTable(new ArrayList<Symbol>());
		//root.getSymbolTable().add(st1);
		//root.getSymbolTable().add(st2);
		System.out.println();
		System.out.println("BSV code:\n" + root.toBSV());
	}
}
