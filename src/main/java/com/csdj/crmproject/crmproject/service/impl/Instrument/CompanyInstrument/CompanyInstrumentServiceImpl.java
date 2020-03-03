package com.csdj.crmproject.crmproject.service.impl.Instrument.CompanyInstrument;

import com.csdj.crmproject.crmproject.dao.Instrument.CompanyInstrument.CompanyInstrumentDao;
import com.csdj.crmproject.crmproject.dao.Instrument.MySalesInstrument.MySalesInstrumentMapper;
import com.csdj.crmproject.crmproject.entity.CusSalesTarget;
import com.csdj.crmproject.crmproject.service.Instrument.CompanyInstrument.CompanyInstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class CompanyInstrumentServiceImpl implements CompanyInstrumentService {
    @Autowired
    private CompanyInstrumentDao dao;

    @Override
    public CusSalesTarget getOrder(String year) {
        return dao.getOrder(year);
    }

    @Override
    public Map<Object, String> dianasOrder() {
        return dao.dianasOrder();
    }

    @Override
    public Map<Object, String> seasonOrder() {
        return dao.seasonOrder();
    }

    @Override
    public Map<Object, String> yearOrder() {
        return dao.yearOrder();
    }

    @Override
    public Map<Object, String> contract() {
        return dao.contract();
    }

    @Override
    public Map<Object, String> dianasContract() {
        return dao.dianasContract();
    }

    @Override
    public Map<Object, String> order() {
        return dao.order();
    }

    @Override
    public Map<Object, String> seasonContract() {
        return dao.seasonContract();
    }

    @Override
    public Map<Object, String> yearContract() {
        return dao.yearContract();
    }

    @Override
    public Double dianasOrReceiPlan() {
        return dao.dianasOrReceiPlan();
    }

    @Override
    public Double dianasRecei_plan() {
        return dao.dianasRecei_plan();
    }

    @Override
    public Double seasonOrReceiPlan() {
        return dao.seasonOrReceiPlan();
    }

    @Override
    public Double seasonRecei_plan() {
        return dao.seasonRecei_plan();
    }

    @Override
    public Double yearOrReceiPlan() {
        return dao.yearOrReceiPlan();
    }

    @Override
    public Double yearRecei_plan() {
        return dao.yearRecei_plan();
    }

    @Override
    public Map<String, Double> yearAccomplish() {
        return dao.yearAccomplish();
    }

    @Override
    public Map<String, Double> yearAnswerAccomplish() {
        return dao.yearAnswerAccomplish();
    }
}
