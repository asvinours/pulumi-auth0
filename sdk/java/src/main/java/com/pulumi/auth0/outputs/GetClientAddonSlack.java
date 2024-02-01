// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientAddonSlack {
    /**
     * @return Slack team name.
     * 
     */
    private String team;

    private GetClientAddonSlack() {}
    /**
     * @return Slack team name.
     * 
     */
    public String team() {
        return this.team;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientAddonSlack defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String team;
        public Builder() {}
        public Builder(GetClientAddonSlack defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.team = defaults.team;
        }

        @CustomType.Setter
        public Builder team(String team) {
            if (team == null) {
              throw new MissingRequiredPropertyException("GetClientAddonSlack", "team");
            }
            this.team = team;
            return this;
        }
        public GetClientAddonSlack build() {
            final var _resultValue = new GetClientAddonSlack();
            _resultValue.team = team;
            return _resultValue;
        }
    }
}
