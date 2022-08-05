// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HookArgs extends com.pulumi.resources.ResourceArgs {

    public static final HookArgs Empty = new HookArgs();

    /**
     * Dependencies of this hook used by the WebTask server.
     * 
     */
    @Import(name="dependencies")
    private @Nullable Output<Map<String,Object>> dependencies;

    /**
     * @return Dependencies of this hook used by the WebTask server.
     * 
     */
    public Optional<Output<Map<String,Object>>> dependencies() {
        return Optional.ofNullable(this.dependencies);
    }

    /**
     * Whether the hook is enabled, or disabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the hook is enabled, or disabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Name of this hook.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of this hook.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Code to be executed when this hook runs.
     * 
     */
    @Import(name="script", required=true)
    private Output<String> script;

    /**
     * @return Code to be executed when this hook runs.
     * 
     */
    public Output<String> script() {
        return this.script;
    }

    /**
     * Map(String), sets the hook secrets associated with this hook.
     * If specified, any secrets not listed here will be removed from the hook.
     * 
     */
    @Import(name="secrets")
    private @Nullable Output<Map<String,Object>> secrets;

    /**
     * @return Map(String), sets the hook secrets associated with this hook.
     * If specified, any secrets not listed here will be removed from the hook.
     * 
     */
    public Optional<Output<Map<String,Object>>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    /**
     * Execution stage of this rule. Can be `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, or `send-phone-message`.
     * 
     */
    @Import(name="triggerId", required=true)
    private Output<String> triggerId;

    /**
     * @return Execution stage of this rule. Can be `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, or `send-phone-message`.
     * 
     */
    public Output<String> triggerId() {
        return this.triggerId;
    }

    private HookArgs() {}

    private HookArgs(HookArgs $) {
        this.dependencies = $.dependencies;
        this.enabled = $.enabled;
        this.name = $.name;
        this.script = $.script;
        this.secrets = $.secrets;
        this.triggerId = $.triggerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HookArgs $;

        public Builder() {
            $ = new HookArgs();
        }

        public Builder(HookArgs defaults) {
            $ = new HookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dependencies Dependencies of this hook used by the WebTask server.
         * 
         * @return builder
         * 
         */
        public Builder dependencies(@Nullable Output<Map<String,Object>> dependencies) {
            $.dependencies = dependencies;
            return this;
        }

        /**
         * @param dependencies Dependencies of this hook used by the WebTask server.
         * 
         * @return builder
         * 
         */
        public Builder dependencies(Map<String,Object> dependencies) {
            return dependencies(Output.of(dependencies));
        }

        /**
         * @param enabled Whether the hook is enabled, or disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the hook is enabled, or disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name Name of this hook.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of this hook.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param script Code to be executed when this hook runs.
         * 
         * @return builder
         * 
         */
        public Builder script(Output<String> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script Code to be executed when this hook runs.
         * 
         * @return builder
         * 
         */
        public Builder script(String script) {
            return script(Output.of(script));
        }

        /**
         * @param secrets Map(String), sets the hook secrets associated with this hook.
         * If specified, any secrets not listed here will be removed from the hook.
         * 
         * @return builder
         * 
         */
        public Builder secrets(@Nullable Output<Map<String,Object>> secrets) {
            $.secrets = secrets;
            return this;
        }

        /**
         * @param secrets Map(String), sets the hook secrets associated with this hook.
         * If specified, any secrets not listed here will be removed from the hook.
         * 
         * @return builder
         * 
         */
        public Builder secrets(Map<String,Object> secrets) {
            return secrets(Output.of(secrets));
        }

        /**
         * @param triggerId Execution stage of this rule. Can be `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, or `send-phone-message`.
         * 
         * @return builder
         * 
         */
        public Builder triggerId(Output<String> triggerId) {
            $.triggerId = triggerId;
            return this;
        }

        /**
         * @param triggerId Execution stage of this rule. Can be `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, or `send-phone-message`.
         * 
         * @return builder
         * 
         */
        public Builder triggerId(String triggerId) {
            return triggerId(Output.of(triggerId));
        }

        public HookArgs build() {
            $.script = Objects.requireNonNull($.script, "expected parameter 'script' to be non-null");
            $.triggerId = Objects.requireNonNull($.triggerId, "expected parameter 'triggerId' to be non-null");
            return $;
        }
    }

}
