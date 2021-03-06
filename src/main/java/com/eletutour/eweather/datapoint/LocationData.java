/*-
 * ========================LICENSE_START=================================
 * EWeather
 * ======================================================================
 * Copyright (C) 2018 - 2019 Erwan Le Tutour
 * ======================================================================
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =========================LICENSE_END==================================
 */
package com.eletutour.eweather.datapoint;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class LocationData {

    @SerializedName("place_id")
    private String placeId;
    @SerializedName("licence")
    private String license;
    @SerializedName("osm_type")
    private String osmType;
    @SerializedName("osm_id")
    private String osmId;
    @SerializedName("boundingbox")
    private ArrayList<String> geoLocation;
    @SerializedName("lat")
    private String lat;
    @SerializedName("lon")
    private String lon;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("class")
    private String classType;
    @SerializedName("type")
    private String type;
    @SerializedName("importance")
    private String importance;
    @SerializedName("icon")
    private String icon;

}
