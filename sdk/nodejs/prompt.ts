// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With this resource, you can manage your Auth0 prompts, including choosing the login experience version.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const example = new auth0.Prompt("example", {
 *     universalLoginExperience: "classic",
 * });
 * ```
 */
export class Prompt extends pulumi.CustomResource {
    /**
     * Get an existing Prompt resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PromptState, opts?: pulumi.CustomResourceOptions): Prompt {
        return new Prompt(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/prompt:Prompt';

    /**
     * Returns true if the given object is an instance of Prompt.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Prompt {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Prompt.__pulumiType;
    }

    public readonly universalLoginExperience!: pulumi.Output<string | undefined>;

    /**
     * Create a Prompt resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PromptArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PromptArgs | PromptState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as PromptState | undefined;
            inputs["universalLoginExperience"] = state ? state.universalLoginExperience : undefined;
        } else {
            const args = argsOrState as PromptArgs | undefined;
            inputs["universalLoginExperience"] = args ? args.universalLoginExperience : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Prompt.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Prompt resources.
 */
export interface PromptState {
    readonly universalLoginExperience?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Prompt resource.
 */
export interface PromptArgs {
    readonly universalLoginExperience?: pulumi.Input<string>;
}
