package com.youda.oa.controller;

import com.youda.oa.model.Baike;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MongoController {

    private static final Logger logger = LoggerFactory.getLogger(MongoController.class);

    @Autowired
    MongoTemplate mongoTemplate;

    @RequestMapping(value = "/baike/{name}")
    public Baike getUser(@PathVariable String name) {

        logger.info("--------使用mongodb--------");
        Baike baike = mongoTemplate.findById(name, Baike.class);
        logger.info(baike.getId());
        return baike;
    }

    @GetMapping("/query/bad/{bad}")
    public List<Baike> queryBad(@PathVariable int bad) {
        Criteria criteria = Criteria.where("comment.bad").gt(bad);
        List<Baike> list = mongoTemplate.find(Query.query(criteria), Baike.class);
        return list;
    }
}
