package integration.inventory;

import model.purchase.RegisteredItem;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryHandlerTest {

    ItemDTO wantedItem;
    InventoryHandler inventory;
    int searchedIdentifier;
    @BeforeEach
    void setUp() {
        inventory = new InventoryHandler();
        searchedIdentifier = 1;
        wantedItem = new ItemDTO(1,"Test", 1,0);
        inventory.addItemsToStock(new RegisteredItem[]{new RegisteredItem(wantedItem,100)});


    }

    @AfterEach
    void tearDown() {
        inventory = null;
        wantedItem = null;

    }

    @Test
    void fetchItemFromInventory() {
        ItemDTO fetchedItem=inventory.fetchItemFromInventory(new EnteredItemInfoDTO(searchedIdentifier,1));
        assertEquals(fetchedItem,wantedItem, " items are not the same");
    }

}