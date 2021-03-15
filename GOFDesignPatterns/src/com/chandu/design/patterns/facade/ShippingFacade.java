package com.chandu.design.patterns.facade;

public class ShippingFacade {

	private ShippingProcess shipping = new ShippingProcess();;

	public void shippingProduct(String name, int quantity) {
		if (shipping.checkLabel(name)) {
			String trackingId = shipping.shipProduct(name, quantity);
			shipping.deliverProduct(trackingId);

		}

	}

}
