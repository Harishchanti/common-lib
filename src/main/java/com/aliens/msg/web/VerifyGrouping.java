package com.aliens.msg.web;

import com.aliens.hipster.domain.InboundMessages;
import com.aliens.hipster.repository.InboundMessagesRepository;
import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by jayant on 27/9/16.
 */
@Component
@Slf4j
public class VerifyGrouping {

    @Autowired
    InboundMessagesRepository inboundMessagesRepository;

    public Set<String> invoke()
    {
        boolean health=true;
        Set<String> st= Sets.newConcurrentHashSet();

        Map<String,List<InboundMessages>> map=
        inboundMessagesRepository
            .findAll().stream()
            .collect(Collectors.groupingBy(InboundMessages::getGroupId));

         for(List<InboundMessages> list: map.values()) {
             int i, sz = list.size();
             for (i = 1; i <= sz; i++) {
                 int x=Integer.parseInt(list.get(i - 1).getMessageId());
                 if (x!= i) {
                     st.add(list.get(i-1).getGroupId());
                     break;
                 }
             }
         }

     return st;
    }
}
