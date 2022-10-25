// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TriggerBindingAction {
    /**
     * @return The name of an action.
     * 
     */
    private String displayName;
    /**
     * @return Action ID.
     * 
     */
    private String id;

    private TriggerBindingAction() {}
    /**
     * @return The name of an action.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Action ID.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBindingAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String displayName;
        private String id;
        public Builder() {}
        public Builder(TriggerBindingAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public TriggerBindingAction build() {
            final var o = new TriggerBindingAction();
            o.displayName = displayName;
            o.id = id;
            return o;
        }
    }
}
