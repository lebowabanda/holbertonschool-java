import providers.*;

public class Program {
  public static void main(String[] args) {
    Order order1 = new Order(1, 1500, 234.90);
    Order order2 = new Order(2, 600, 124.00);
    Order order3 = new Order(3, 3000, 53.00);
    Order order4 = new Order(4, 7000, 300.00);

    OrderProcessor orderProcessorFedex = new OrderProcessor(new Fedex());
    orderProcessorFedex.process(order1);

    System.out.printf("%s - %,2f\n", order1.getShipping().getShippingProviderType(), order1.getShipping().getValue());

    OrderProcessor orderProcessorUnitedParcelService = new OrderProcessor(new UnitedParcelService());
    orderProcessorUnitedParcelService.process(order1);

    System.out.printf("%s - %,2f\n", order1.getShipping().getShippingProviderType(), order1.getShipping().getValue());

    OrderProcessor orderProcessorDalseyHillblomLynn = new OrderProcessor(new DalseyHillblomLynn());
    orderProcessorDalseyHillblomLynn.process(order1);

    System.out.printf("%s - %,2f\n", order1.getShipping().getShippingProviderType(), order1.getShipping().getValue());

    System.out.println("-----");

    orderProcessorFedex.process(order2);
    System.out.printf("%s - %,2f\n", order2.getShipping().getShippingProviderType(), order2.getShipping().getValue());

    orderProcessorUnitedParcelService.process(order2);
    System.out.printf("%s - %,2f\n", order2.getShipping().getShippingProviderType(), order2.getShipping().getValue());

    orderProcessorDalseyHillblomLynn.process(order2);
    System.out.printf("%s - %,2f\n", order2.getShipping().getShippingProviderType(), order2.getShipping().getValue());

    System.out.println("-----");

    orderProcessorFedex.process(order3);
    System.out.printf("%s - %,2f\n", order3.getShipping().getShippingProviderType(), order3.getShipping().getValue());

    orderProcessorUnitedParcelService.process(order3);
    System.out.printf("%s - %,2f\n", order3.getShipping().getShippingProviderType(), order3.getShipping().getValue());

    orderProcessorDalseyHillblomLynn.process(order3);
    System.out.printf("%s - %,2f\n", order3.getShipping().getShippingProviderType(), order3.getShipping().getValue());

    System.out.println("-----");

    orderProcessorFedex.process(order4);
    System.out.printf("%s - %,2f\n", order4.getShipping().getShippingProviderType(), order4.getShipping().getValue());

    orderProcessorUnitedParcelService.process(order4);
    System.out.printf("%s - %,2f\n", order4.getShipping().getShippingProviderType(), order4.getShipping().getValue());

    orderProcessorDalseyHillblomLynn.process(order4);
    System.out.printf("%s - %,2f\n", order4.getShipping().getShippingProviderType(), order4.getShipping().getValue());
  }
}