package dev.danvega.streamsschedule.controller;


import dev.danvega.streamsschedule.model.LiveStream;

import dev.danvega.streamsschedule.model.Webhook;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

import org.json.JSONArray;

import org.json.JSONObject;



@RestController
@RequestMapping
public class LiveStreamController {

    private List<LiveStream> streams = new ArrayList<>();
    private List<Webhook> webhooks = new ArrayList<>();
    private HashMap<Long, String > map =new HashMap<Long, String> ();

//    public static void parseObject(JSONObject json, String key) {
//        // System.out.println(json.has(key));
//        System.out.println(json.get(key));
//    }


    public static String getKey(JSONObject json, String key) {

        boolean exists = json.has(key);
        Iterator<?> keys;
        String nextKeys;
        String res="exe";

        if (!exists) {
            keys = json.keys();
            while (keys.hasNext()) {
                nextKeys = (String) keys.next();
                try {

                    if (json.get(nextKeys) instanceof JSONObject) {
                        System.out.println(nextKeys+"a");
                        if (exists == false) {
                            if(res.equals("exe")) res=new String(getKey(json.getJSONObject(nextKeys), key));
                        }

                    } else if (json.get(nextKeys) instanceof JSONArray) {
                        JSONArray jsonarray = json.getJSONArray(nextKeys);
//                        System.out.println("arr");
//                        for (int i = 0; i < jsonarray.length(); i++) {
//                            String jsonarrayString = jsonarray.get(i).toString();
//                            JSONObject innerJSOn = new JSONObject(jsonarrayString);
//
//                            if (exists == false) {
//
//                                if(!res.equals("exe")) res=new String(getKey(innerJSOn, key));
//                            }
//
//                        }
                        System.out.println(jsonarray.get(0).toString()+"b");
                        if (exists == false) {
                            if(res.equals("exe")) res=new String(getKey((JSONObject) jsonarray.get(0), key));
                        }

                    }

                } catch (Exception e) {
                    // TODO: handle exception
                }

            }

        } else {
            System.out.println(json.toString()+"f");
            if(json.get(key) instanceof JSONArray ) {
                JSONArray jsonArray = json.getJSONArray(key);
//                List<String> list = new ArrayList<String>();
//                for(int i=0; i < jsonArray.length(); i++) {
//                    list.add(jsonArray.getString(i));
//                }
                if(res.equals("exe")) {
                    String res1=new String(((JSONArray) json.get(key)).get(0).toString());
                    System.out.println(res1+"f");
                    res= new String(res1);
                }
//                res=new String(json.getJSONArray(key).toString());
            }
            else if(res.equals("exe")) res=new String(json.get(key).toString());
        }
        return res;
    }

    @GetMapping
    public HashMap<Long, String >  findAll() {
        return map;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/processWebhook")
    public String create(@Valid @RequestBody Map<String, Object> obj) {
        JSONObject jsonObject = new JSONObject(obj);
        long from = Long.parseLong(getKey(jsonObject,"from"));
        String Message =getKey(jsonObject,"title");
        map.put(from,Message);
        return Message;
    }

//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @PutMapping("/updateHashMap/{id}")
//    public void update(@RequestBody LiveStream stream, @PathVariable String id) {
////        repository.update(stream,id);
//        LiveStream existing = streams.stream().filter(s -> s.id().equals(id))
//                .findFirst()
//                .orElseThrow(() -> new IllegalArgumentException("Stream not found"));
//        int i = streams.indexOf(existing);
//        streams.set(i, stream);
//    }

//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable String id) {
//
////        repository.delete(id);
//        streams.removeIf(stream -> stream.id().equals(id));
//    }

}
