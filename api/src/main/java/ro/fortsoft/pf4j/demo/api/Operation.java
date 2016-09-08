package ro.fortsoft.pf4j.demo.api;

import ro.fortsoft.pf4j.ExtensionPoint;

public interface Operation extends ExtensionPoint{
    float compute(float... args);
}
