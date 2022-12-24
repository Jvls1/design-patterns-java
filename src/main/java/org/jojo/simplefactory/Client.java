package org.jojo.simplefactory;

public class Client {

	public static void main(String[] args) throws IllegalAccessException {
		Post post = PostFactory.createPost("news");
		System.out.println(post);
	}

}
