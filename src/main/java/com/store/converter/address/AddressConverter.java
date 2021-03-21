package com.store.converter.address;

import com.store.converter.AbstractConverter;
import com.store.entity.address.AddressEntity;
import com.store.model.address.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressConverter extends AbstractConverter<AddressEntity, Address> {
    @Override
    public Address convert(AddressEntity addressEntity) {
        return new Address(addressEntity.getId(), addressEntity.getCity(),
                addressEntity.getStreet(), addressEntity.getHouse(), addressEntity.getFlat());
    }

    @Override
    public AddressEntity convertReverse(Address address) {
        return new AddressEntity(address.getId(), address.getCity(),
                address.getStreet(), address.getHouse(), address.getFlat());
    }
}
