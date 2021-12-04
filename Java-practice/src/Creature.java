
//interfaceはクラスの仲間
//あまりに曖昧すぎて特別扱いされた抽象クラス
public interface Creature {
//	public abstract void run();
//  インターフェイスで宣言されたメソッドは自動的にpublicかつabstractになるというルールがある
//	そのためpublic abstractを省略しても記述可能
	void run(); //で可能
}

////interfaceで定数宣言
//public interface Circle{
//	double pi = 3.141592;
//}

//自動的に public static finalが補われる

