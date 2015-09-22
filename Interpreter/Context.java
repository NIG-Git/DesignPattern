package Interpreter;

import java.util.StringTokenizer;

public class Context {

	private StringTokenizer tokenizer;
	private String token;

	public Context(String source){

		tokenizer = new StringTokenizer(source);

		nextToken();

	}

	public String getToken(){
		return token;
	}

	public void nextToken(){

		String token = null;

		if(tokenizer.hasMoreTokens()){

			token = tokenizer.nextToken();

		}

		this.token = token;

	}

	public boolean notEnd(){
		return tokenizer.hasMoreTokens();
	}

}
