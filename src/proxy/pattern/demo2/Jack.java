package proxy.pattern.demo2;

public class Jack implements Student {

	@Override
	public void sing() {
		System.out.println("我最喜欢的歌曲是《那不勒的黎明》！");
	}

	@Override
	public void dance() {
		System.out.println("我喜欢古典舞！");
	}

	@Override
	public void draw() {
		System.out.println("我喜欢精美的魔幻题材的画作！");
	}

}
