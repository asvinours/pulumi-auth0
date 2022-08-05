// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.PromptArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.PromptState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With this resource, you can manage your Auth0 prompts, including choosing the login experience version.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Prompt;
 * import com.pulumi.auth0.PromptArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Prompt(&#34;example&#34;, PromptArgs.builder()        
 *             .identifierFirst(false)
 *             .universalLoginExperience(&#34;classic&#34;)
 *             .webauthnPlatformFirstFactor(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * As this is not a resource identifiable by an ID within the Auth0 Management API, prompt can be imported using a random string. We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) e.g.
 * 
 * ```sh
 *  $ pulumi import auth0:index/prompt:Prompt example 22f4f21b-017a-319d-92e7-2291c1ca36c4
 * ```
 * 
 */
@ResourceType(type="auth0:index/prompt:Prompt")
public class Prompt extends com.pulumi.resources.CustomResource {
    /**
     * Boolean. Indicates whether the identifier first is used when using the new universal login experience.
     * 
     */
    @Export(name="identifierFirst", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> identifierFirst;

    /**
     * @return Boolean. Indicates whether the identifier first is used when using the new universal login experience.
     * 
     */
    public Output<Optional<Boolean>> identifierFirst() {
        return Codegen.optional(this.identifierFirst);
    }
    /**
     * Which login experience to use. Options include `classic` and `new`.
     * 
     */
    @Export(name="universalLoginExperience", type=String.class, parameters={})
    private Output</* @Nullable */ String> universalLoginExperience;

    /**
     * @return Which login experience to use. Options include `classic` and `new`.
     * 
     */
    public Output<Optional<String>> universalLoginExperience() {
        return Codegen.optional(this.universalLoginExperience);
    }
    /**
     * Boolean. Determines if the login screen uses identifier and biometrics first.
     * 
     */
    @Export(name="webauthnPlatformFirstFactor", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> webauthnPlatformFirstFactor;

    /**
     * @return Boolean. Determines if the login screen uses identifier and biometrics first.
     * 
     */
    public Output<Optional<Boolean>> webauthnPlatformFirstFactor() {
        return Codegen.optional(this.webauthnPlatformFirstFactor);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Prompt(String name) {
        this(name, PromptArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Prompt(String name, @Nullable PromptArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Prompt(String name, @Nullable PromptArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/prompt:Prompt", name, args == null ? PromptArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Prompt(String name, Output<String> id, @Nullable PromptState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/prompt:Prompt", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Prompt get(String name, Output<String> id, @Nullable PromptState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Prompt(name, id, state, options);
    }
}
