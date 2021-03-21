package com.store.converter.personalData;

import com.store.converter.address.AddressConverter;
import com.store.converter.AbstractConverter;
import com.store.entity.personalData.PersonalDataEntity;
import com.store.model.personalData.PersonalData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonalDataConverter extends AbstractConverter<PersonalDataEntity, PersonalData> {
    private AddressConverter addressConverter;

    @Override
    public PersonalData convert(PersonalDataEntity personalDataEntity) {
        return new PersonalData(personalDataEntity.getId(), personalDataEntity.getPhone(),
                addressConverter.convert(personalDataEntity.getAddress()));
    }

    @Override
    public PersonalDataEntity convertReverse(PersonalData personalData) {
        return new PersonalDataEntity(personalData.getId(), personalData.getPhone(),
                addressConverter.convertReverse(personalData.getAddress()));
    }

    @Autowired
    public void setAddressConverter(AddressConverter addressConverter) {
        this.addressConverter = addressConverter;
    }
}
