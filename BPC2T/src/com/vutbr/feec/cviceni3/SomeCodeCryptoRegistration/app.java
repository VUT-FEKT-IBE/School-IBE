package com.vutbr.feec.cviceni3.SomeCodeCryptoRegistration;

public class app {
	public static void main(String[] args) {
			PersonService service1 = new BcryptPersonRegistration();
			PersonService service2 = new PBKDF2PersonRegistration();
			Person p1 = new Person(1, "dds", "sdssadssd", "ddsdsdsddsd");
			Person p2 = new Person(1, "dds", "sdssadssd", "ddsdsdsddsd");
			service1.register(p1);
			service2.register(p2);
			service1.work();
			service2.work();
	}

	
}
