// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export * from "./action";
export * from "./attackProtection";
export * from "./branding";
export * from "./client";
export * from "./clientGrant";
export * from "./connection";
export * from "./customDomain";
export * from "./customDomainVerification";
export * from "./email";
export * from "./emailTemplate";
export * from "./getClient";
export * from "./getGlobalClient";
export * from "./getTenant";
export * from "./globalClient";
export * from "./guardian";
export * from "./hook";
export * from "./logStream";
export * from "./organization";
export * from "./prompt";
export * from "./promptCustomText";
export * from "./provider";
export * from "./resourceServer";
export * from "./role";
export * from "./rule";
export * from "./ruleConfig";
export * from "./tenant";
export * from "./triggerBinding";
export * from "./user";

// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

// Import resources to register:
import { Action } from "./action";
import { AttackProtection } from "./attackProtection";
import { Branding } from "./branding";
import { Client } from "./client";
import { ClientGrant } from "./clientGrant";
import { Connection } from "./connection";
import { CustomDomain } from "./customDomain";
import { CustomDomainVerification } from "./customDomainVerification";
import { Email } from "./email";
import { EmailTemplate } from "./emailTemplate";
import { GlobalClient } from "./globalClient";
import { Guardian } from "./guardian";
import { Hook } from "./hook";
import { LogStream } from "./logStream";
import { Organization } from "./organization";
import { Prompt } from "./prompt";
import { PromptCustomText } from "./promptCustomText";
import { ResourceServer } from "./resourceServer";
import { Role } from "./role";
import { Rule } from "./rule";
import { RuleConfig } from "./ruleConfig";
import { Tenant } from "./tenant";
import { TriggerBinding } from "./triggerBinding";
import { User } from "./user";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "auth0:index/action:Action":
                return new Action(name, <any>undefined, { urn })
            case "auth0:index/attackProtection:AttackProtection":
                return new AttackProtection(name, <any>undefined, { urn })
            case "auth0:index/branding:Branding":
                return new Branding(name, <any>undefined, { urn })
            case "auth0:index/client:Client":
                return new Client(name, <any>undefined, { urn })
            case "auth0:index/clientGrant:ClientGrant":
                return new ClientGrant(name, <any>undefined, { urn })
            case "auth0:index/connection:Connection":
                return new Connection(name, <any>undefined, { urn })
            case "auth0:index/customDomain:CustomDomain":
                return new CustomDomain(name, <any>undefined, { urn })
            case "auth0:index/customDomainVerification:CustomDomainVerification":
                return new CustomDomainVerification(name, <any>undefined, { urn })
            case "auth0:index/email:Email":
                return new Email(name, <any>undefined, { urn })
            case "auth0:index/emailTemplate:EmailTemplate":
                return new EmailTemplate(name, <any>undefined, { urn })
            case "auth0:index/globalClient:GlobalClient":
                return new GlobalClient(name, <any>undefined, { urn })
            case "auth0:index/guardian:Guardian":
                return new Guardian(name, <any>undefined, { urn })
            case "auth0:index/hook:Hook":
                return new Hook(name, <any>undefined, { urn })
            case "auth0:index/logStream:LogStream":
                return new LogStream(name, <any>undefined, { urn })
            case "auth0:index/organization:Organization":
                return new Organization(name, <any>undefined, { urn })
            case "auth0:index/prompt:Prompt":
                return new Prompt(name, <any>undefined, { urn })
            case "auth0:index/promptCustomText:PromptCustomText":
                return new PromptCustomText(name, <any>undefined, { urn })
            case "auth0:index/resourceServer:ResourceServer":
                return new ResourceServer(name, <any>undefined, { urn })
            case "auth0:index/role:Role":
                return new Role(name, <any>undefined, { urn })
            case "auth0:index/rule:Rule":
                return new Rule(name, <any>undefined, { urn })
            case "auth0:index/ruleConfig:RuleConfig":
                return new RuleConfig(name, <any>undefined, { urn })
            case "auth0:index/tenant:Tenant":
                return new Tenant(name, <any>undefined, { urn })
            case "auth0:index/triggerBinding:TriggerBinding":
                return new TriggerBinding(name, <any>undefined, { urn })
            case "auth0:index/user:User":
                return new User(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("auth0", "index/action", _module)
pulumi.runtime.registerResourceModule("auth0", "index/attackProtection", _module)
pulumi.runtime.registerResourceModule("auth0", "index/branding", _module)
pulumi.runtime.registerResourceModule("auth0", "index/client", _module)
pulumi.runtime.registerResourceModule("auth0", "index/clientGrant", _module)
pulumi.runtime.registerResourceModule("auth0", "index/connection", _module)
pulumi.runtime.registerResourceModule("auth0", "index/customDomain", _module)
pulumi.runtime.registerResourceModule("auth0", "index/customDomainVerification", _module)
pulumi.runtime.registerResourceModule("auth0", "index/email", _module)
pulumi.runtime.registerResourceModule("auth0", "index/emailTemplate", _module)
pulumi.runtime.registerResourceModule("auth0", "index/globalClient", _module)
pulumi.runtime.registerResourceModule("auth0", "index/guardian", _module)
pulumi.runtime.registerResourceModule("auth0", "index/hook", _module)
pulumi.runtime.registerResourceModule("auth0", "index/logStream", _module)
pulumi.runtime.registerResourceModule("auth0", "index/organization", _module)
pulumi.runtime.registerResourceModule("auth0", "index/prompt", _module)
pulumi.runtime.registerResourceModule("auth0", "index/promptCustomText", _module)
pulumi.runtime.registerResourceModule("auth0", "index/resourceServer", _module)
pulumi.runtime.registerResourceModule("auth0", "index/role", _module)
pulumi.runtime.registerResourceModule("auth0", "index/rule", _module)
pulumi.runtime.registerResourceModule("auth0", "index/ruleConfig", _module)
pulumi.runtime.registerResourceModule("auth0", "index/tenant", _module)
pulumi.runtime.registerResourceModule("auth0", "index/triggerBinding", _module)
pulumi.runtime.registerResourceModule("auth0", "index/user", _module)

import { Provider } from "./provider";

pulumi.runtime.registerResourcePackage("auth0", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:auth0") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
