package com.echotech.master.util;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.echotech.master.dto.PatientFieldConfigItem;

@Service
public class WebServiceUtility {

	/** Order is the field Id (1-based) expected by EchoQueue patient_fields_master. */
	private static final List<String> DEFAULT_PATIENT_FIELD_NAMES = List.of(
			"Mobile Number",
			"Patient Full Name",
			"Age",
			"Gender",
			"Blood Group",
			"Date Of Birth",
			"City");

	@Value("${spring.queue.base.url}")
	private String queueBaseUrl;

	public String getClinicPatientFieldsConfigUrl() {
		return queueBaseUrl + "api/v1/clinicPatientFields/saveConfig";
	}

	public List<PatientFieldConfigItem> getDefaultPatientFields() {
		return IntStream.range(0, DEFAULT_PATIENT_FIELD_NAMES.size())
				.mapToObj(index -> new PatientFieldConfigItem(
						index + 1,
						DEFAULT_PATIENT_FIELD_NAMES.get(index),
						Boolean.TRUE,
						Boolean.TRUE))
				.toList();
	}

}
