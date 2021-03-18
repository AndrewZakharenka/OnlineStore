package com.store.repository.personalData;

import com.store.entity.personalData.PersonalDataEntity;
import com.store.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalDataRepository extends BaseRepository<PersonalDataEntity, Long> {

}
