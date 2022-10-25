// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.TriggerBindingArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.TriggerBindingState;
import com.pulumi.auth0.outputs.TriggerBindingAction;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * With this resource, you can bind an action to a trigger. Once an action is created and deployed, it can be attached (i.e. bound) to a trigger so that it will be executed as part of a flow. The list of actions reflects the order in which they will be executed during the appropriate flow.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Action;
 * import com.pulumi.auth0.ActionArgs;
 * import com.pulumi.auth0.inputs.ActionSupportedTriggersArgs;
 * import com.pulumi.auth0.TriggerBinding;
 * import com.pulumi.auth0.TriggerBindingArgs;
 * import com.pulumi.auth0.inputs.TriggerBindingActionArgs;
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
 *         var actionFoo = new Action(&#34;actionFoo&#34;, ActionArgs.builder()        
 *             .code(&#34;&#34;&#34;
 * exports.onContinuePostLogin = async (event, api) =&gt; {
 *   console.log(&#34;foo&#34;);
 * };&#34;
 *             &#34;&#34;&#34;)
 *             .deploy(true)
 *             .supportedTriggers(ActionSupportedTriggersArgs.builder()
 *                 .id(&#34;post-login&#34;)
 *                 .version(&#34;v3&#34;)
 *                 .build())
 *             .build());
 * 
 *         var actionBar = new Action(&#34;actionBar&#34;, ActionArgs.builder()        
 *             .code(&#34;&#34;&#34;
 * exports.onContinuePostLogin = async (event, api) =&gt; {
 *   console.log(&#34;bar&#34;);
 * };&#34;
 *             &#34;&#34;&#34;)
 *             .deploy(true)
 *             .supportedTriggers(ActionSupportedTriggersArgs.builder()
 *                 .id(&#34;post-login&#34;)
 *                 .version(&#34;v3&#34;)
 *                 .build())
 *             .build());
 * 
 *         var loginFlow = new TriggerBinding(&#34;loginFlow&#34;, TriggerBindingArgs.builder()        
 *             .trigger(&#34;post-login&#34;)
 *             .actions(            
 *                 TriggerBindingActionArgs.builder()
 *                     .id(actionFoo.id())
 *                     .displayName(actionFoo.name())
 *                     .build(),
 *                 TriggerBindingActionArgs.builder()
 *                     .id(actionBar.id())
 *                     .displayName(actionBar.name())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * # This resource can be imported using the bindings trigger ID. # # Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/triggerBinding:TriggerBinding example &#34;post-login&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/triggerBinding:TriggerBinding")
public class TriggerBinding extends com.pulumi.resources.CustomResource {
    /**
     * The actions bound to this trigger
     * 
     */
    @Export(name="actions", type=List.class, parameters={TriggerBindingAction.class})
    private Output<List<TriggerBindingAction>> actions;

    /**
     * @return The actions bound to this trigger
     * 
     */
    public Output<List<TriggerBindingAction>> actions() {
        return this.actions;
    }
    /**
     * The ID of the trigger to bind with.
     * 
     */
    @Export(name="trigger", type=String.class, parameters={})
    private Output<String> trigger;

    /**
     * @return The ID of the trigger to bind with.
     * 
     */
    public Output<String> trigger() {
        return this.trigger;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TriggerBinding(String name) {
        this(name, TriggerBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TriggerBinding(String name, TriggerBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TriggerBinding(String name, TriggerBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/triggerBinding:TriggerBinding", name, args == null ? TriggerBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TriggerBinding(String name, Output<String> id, @Nullable TriggerBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/triggerBinding:TriggerBinding", name, state, makeResourceOptions(options, id));
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
    public static TriggerBinding get(String name, Output<String> id, @Nullable TriggerBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TriggerBinding(name, id, state, options);
    }
}
