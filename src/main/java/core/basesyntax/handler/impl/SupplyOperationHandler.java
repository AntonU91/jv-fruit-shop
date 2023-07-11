package core.basesyntax.handler.impl;

import core.basesyntax.db.Storage;
import core.basesyntax.handler.ShopOperationHandler;

public class SupplyOperationHandler implements ShopOperationHandler {
    @Override
    public void doOperation(String fruitName, String quantityToOperate) {
        Integer oldQuantityValue = Storage.FRUIT_STORAGE.get(fruitName.toLowerCase());
        oldQuantityValue = oldQuantityValue == null ? 0 : oldQuantityValue;
        Storage.FRUIT_STORAGE.put(fruitName.toLowerCase(),
                Integer.parseInt(quantityToOperate) + oldQuantityValue);
    }
}
