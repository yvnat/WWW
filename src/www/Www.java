package www;

public class Www {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriceTable p = new PriceTable();
		p.addRepairPrice("pop", RepairLevel.platinum, 13, 9);
		System.out.print(p);
		p.addRepairPrice("probike", RepairLevel.silver, 10, 3);
		p.addRepairPrice("probike", RepairLevel.gold, 20, 6);
		p.addRepairPrice("probike", RepairLevel.platinum, 13, 9);
		System.out.print(p);
		p.addRepairPrice("probike", RepairLevel.silver, 1, 90);
		p.addRepairPrice("probike", RepairLevel.platinum, 130, 9);
		System.out.print(p);
		p.addRepairPrice("brobike", RepairLevel.platinum, 130, -1);
		p.addRepairPrice("Kraftfahrzeughaftpflichtversicherung", RepairLevel.silver, 1, 1);
		p.addRepairPrice("Kraftfahrzeughaftpflichtversicherung", RepairLevel.gold, 2, 2);
		p.addRepairPrice("Kraftfahrzeughaftpflichtversicherung", RepairLevel.platinum, 3, 3);
		p.addRepairPrice("bop", RepairLevel.silver, 10, 10);
		p.addRepairPrice("bop", RepairLevel.gold, 10, 20);
		p.addRepairPrice("bop", RepairLevel.platinum, 10, 21);
		System.out.print(p);
	}
    
}
