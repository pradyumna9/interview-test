package com.mycomp.test;

public final class ImutableTest {
	
	private int i;
	public ImutableTest(int i) {
		this.i = i;
	}
	public ImutableTest modify(int i) {
		if(this.i == i) {
			return this;
		}
		else {
			return new ImutableTest(i);
		}
	}
public static void main(String[] args) {
	ImutableTest im = new ImutableTest(10);
	ImutableTest im2 = im.modify(100);
	ImutableTest im3 = im.modify(10);
	ImutableTest im4 = im.modify(100);
	ImutableTest im5 = im.modify(100);
	System.out.println(im==im2);
	System.out.println(im==im3);
	System.out.println(im5==im4);
}
	

}
