/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.logs.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Filtered Log Event JSON Unmarshaller
 */
public class FilteredLogEventJsonUnmarshaller implements Unmarshaller<FilteredLogEvent, JsonUnmarshallerContext> {

    public FilteredLogEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        FilteredLogEvent filteredLogEvent = new FilteredLogEvent();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("logStreamName", targetDepth)) {
                    context.nextToken();
                    filteredLogEvent.setLogStreamName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timestamp", targetDepth)) {
                    context.nextToken();
                    filteredLogEvent.setTimestamp(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    filteredLogEvent.setMessage(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ingestionTime", targetDepth)) {
                    context.nextToken();
                    filteredLogEvent.setIngestionTime(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("eventId", targetDepth)) {
                    context.nextToken();
                    filteredLogEvent.setEventId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return filteredLogEvent;
    }

    private static FilteredLogEventJsonUnmarshaller instance;
    public static FilteredLogEventJsonUnmarshaller getInstance() {
        if (instance == null) instance = new FilteredLogEventJsonUnmarshaller();
        return instance;
    }
}
    