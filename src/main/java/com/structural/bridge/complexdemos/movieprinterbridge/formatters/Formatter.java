package com.structural.bridge.complexdemos.movieprinterbridge.formatters;

import com.structural.bridge.complexdemos.movieprinterbridge.helpers.Detail;

import java.util.List;

public interface Formatter {

    String format(String header, List<Detail> details);
}
