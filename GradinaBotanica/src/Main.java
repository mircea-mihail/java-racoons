public class Main {
    public static void main(String[] args) {
        Plant aloeVerra = new Plant("aloe", "Verra", 1.2, 0.2);
        System.out.println(aloeVerra.getM_age());
    }
}

// a tab means that the indented class inherents the non-indented class above
// the purpose of this project is to help manage and organise the resources and
// available greenery in a Botanical Garden.

// Classes:

// Base Entity
//      id
//      createDate
//      deleteDate

// Plant
//     Tree
//     Herb
//     Shrub
//     Succulent

// Employee
//      Botanical Engineer      responsible for designing, constructing, and maintaining the physical infrastructure
//                              and systems that support plant growth and care.
//                              irrigation systems, greenhouse design and construction, climate control systems,
//                              water management systems, and other aspects of the botanical garden's infrastructure.
//      Horticulturist          cultivation, care, and management of plants within the botanical garden.
//                              planting, watering, pruning, fertilizing, pest control,
//                              and maintaining the overall health and appearance of the plants.
//      Curator                 plans and implements plant displays, collections management, and acquisitions

// Actions:
//      Get number of Plants
//      Get number of Employees
//      Get total cost of Employees
//      Get total liters of water used by the plants
//      